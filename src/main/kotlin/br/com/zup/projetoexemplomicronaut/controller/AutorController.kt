package br.com.zup.projetoexemplomicronaut.controller

import br.com.zup.projetoexemplomicronaut.cliente.EnderecoClient
import br.com.zup.projetoexemplomicronaut.repository.AutorRepository
import br.com.zup.projetoexemplomicronaut.controller.response.AutorResponse
import br.com.zup.projetoexemplomicronaut.request.NovoAutorRequest
import io.micronaut.http.HttpResponse
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.*
import io.micronaut.http.uri.UriBuilder
import javax.transaction.Transactional
import javax.validation.Valid

@Controller("/autores")
class AutorController(val autorRepository: AutorRepository,
                      val enderecoClient: EnderecoClient
) {

    @Get
    @Transactional
    fun lista() : HttpResponse<List<AutorResponse>> {

        val autores = autorRepository.findAll()
        val resposta = autores.map { autor -> AutorResponse(autor) }
        return HttpResponse.ok(resposta)
    }

    @Post(consumes = [MediaType.APPLICATION_XML])
    @Transactional
    fun cadastra(@Body @Valid request: NovoAutorRequest) : HttpResponse<Any>
    {
        // a partir do cep eu consigo retornar um objeto com rua, cidade, estado
        // que é o HttpResponse

        println("Request => ${request}")
        val enderecoResponse = enderecoClient.consulta(request.cep)
        val autor = request.paraAutor(enderecoResponse.body()!!)

        println("Autor ${autor.nome}")
        autorRepository.save(autor)

        val uri = UriBuilder.of("/autores/{id}")
            .expand(mutableMapOf(Pair("id", autor.id)))

        return HttpResponse.created(uri)
    }

    @Put("/{id}")
    @Transactional
    fun atualiza(@PathVariable id: Long, descricao: String) : HttpResponse<Any>
    {
        val possivelAutor = autorRepository.findById(id)

        if(possivelAutor.isEmpty)
        {
            return HttpResponse.notFound()
        }

        val autor = possivelAutor.get()

        autor.descricao = descricao
        autorRepository.update(autor)

        return HttpResponse.ok(AutorResponse(autor))
    }

    @Get("/obterEmailAutor")
    @Transactional
    fun lista(@QueryValue(defaultValue = "") email: String) : HttpResponse<Any>
    {
        if(email.isBlank())
        {
            val autores = autorRepository.findAll()
            val resposta = autores.map { autor -> AutorResponse(autor) }

            return HttpResponse.ok(resposta)
        }

        val possivelAutor = autorRepository.findByEmail(email)
        if(possivelAutor.isEmpty)
        {
            return HttpResponse.notFound()
        }

        val autor = possivelAutor.get()

        return HttpResponse.ok(AutorResponse(autor))
    }

    @Delete("/{id}")
    @Transactional
    fun deleta(@PathVariable id: Long) : HttpResponse<Any>
    {
        val possivelAutor = autorRepository.findById(id)

        if(possivelAutor.isEmpty)
        {
            return HttpResponse.notFound()
        }

        autorRepository.deleteById(id)

        return HttpResponse.ok()
    }
}