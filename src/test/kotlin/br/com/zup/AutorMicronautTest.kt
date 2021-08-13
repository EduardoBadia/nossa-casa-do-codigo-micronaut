package br.com.zup
import br.com.zup.projetoexemplomicronaut.cliente.EnderecoClient
import br.com.zup.projetoexemplomicronaut.controller.response.AutorResponse
import br.com.zup.projetoexemplomicronaut.controller.response.EnderecoResponse
import br.com.zup.projetoexemplomicronaut.model.Autor
import br.com.zup.projetoexemplomicronaut.model.Endereco
import br.com.zup.projetoexemplomicronaut.repository.AutorRepository
import br.com.zup.projetoexemplomicronaut.request.NovoAutorRequest
import io.micronaut.http.HttpRequest
import io.micronaut.http.HttpResponse
import io.micronaut.http.HttpStatus
import io.micronaut.http.client.HttpClient
import io.micronaut.http.client.annotation.Client
import io.micronaut.runtime.EmbeddedApplication
import io.micronaut.test.annotation.MockBean
import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.mockito.Mockito
import javax.inject.Inject

@MicronautTest
class AutorMicronautTest {

    @field:Inject
    lateinit var autorRepository: AutorRepository

    @field:Inject
    lateinit var enderecoClient: EnderecoClient

    @field:Inject
    @field:Client("/")
    lateinit var client: HttpClient

    lateinit var autor: Autor
    lateinit var enderecoResponse: EnderecoResponse

    @BeforeEach
    internal fun setup()
    {
        enderecoResponse = EnderecoResponse("Rua do sol nascente", "Resende", "RJ")
        val endereco = Endereco(enderecoResponse, "69316-582", "73")
        autor = Autor("Mauricio Lagos", "mauricio@zup.com.br", "um dentista", endereco)
        autorRepository.save(autor)
    }

    @AfterEach
    internal fun tearDown()
    {
        autorRepository.deleteAll()
    }

    @Test
    internal fun deveBuscarUmAutorQuandoUmEmailValidoEhInformado()
    {
        val response = client.toBlocking().exchange("/autores?email=${autor.email}",
            AutorResponse::class.java)

        assertEquals(HttpStatus.OK, response.status)
        assertNotNull(response.body())
        assertEquals(autor.nome, response.body()!!.nome)
        assertEquals(autor.descricao, response.body()!!.descricao)
        assertEquals(autor.email, response.body()!!.email)

    }

    @Test
    internal fun deveCadastrarUmNovoAutor()
    {
        val novoAutorRequest = NovoAutorRequest("Ana Limoeiro",
                                                "ana.limoeiro@zup.com.br", "uma oceanógrafa",
                                                      "69098-302",
                                                       "52"
                                                )
        Mockito.`when`(enderecoClient.consulta(novoAutorRequest.cep)).thenReturn(HttpResponse.ok(enderecoResponse))
        val request = HttpRequest.POST("/autores", novoAutorRequest)
        val response = client.toBlocking().exchange(request, Any::class.java)

        assertEquals(HttpStatus.CREATED, response.status)
        assertTrue(response.headers.contains("Location"))
        assertTrue(response.header("Location")!!.matches("/autores/\\d".toRegex()))
    }

    @MockBean(EnderecoClient::class)
    fun enderecoMock(): EnderecoClient {
        return Mockito.mock(EnderecoClient::class.java)
    }
}
