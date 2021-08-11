package br.com.zup.projetoexemplomicronaut.cliente

import br.com.zup.projetoexemplomicronaut.controller.response.EnderecoResponse
import io.micronaut.http.HttpResponse
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.*
import io.micronaut.http.client.annotation.Client

@Client("https://viacep.com.br/ws")
interface EnderecoClient {

    @Get(value = "/{cep}/xml",
         consumes = [ MediaType.APPLICATION_XML],
         produces = [MediaType.APPLICATION_XML])
         // o produces não tem a ver com o retorno no Response
         // ele é para o caso do Client retornar um XML
         // mas o HttpResponse pode ser um JSON
    fun consulta(@PathVariable cep: String) : HttpResponse<EnderecoResponse>
}