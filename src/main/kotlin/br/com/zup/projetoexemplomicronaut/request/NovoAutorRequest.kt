package br.com.zup.projetoexemplomicronaut.request

import br.com.zup.projetoexemplomicronaut.annotation.Cep
import br.com.zup.projetoexemplomicronaut.controller.response.EnderecoResponse
import br.com.zup.projetoexemplomicronaut.model.Autor
import br.com.zup.projetoexemplomicronaut.model.Endereco
import io.micronaut.core.annotation.Introspected
import javax.validation.constraints.Email
import javax.validation.constraints.NotBlank
import javax.validation.constraints.Size

@Introspected
data class NovoAutorRequest
        (@field:NotBlank val nome: String,
         @field:NotBlank @field:Email val email: String,
         @field:NotBlank @field:Size(max = 400) val descricao: String,
         @field:NotBlank @field:Cep val cep: String,
         @field:NotBlank val numero: String) {

            fun paraAutor(enderecoResponse: EnderecoResponse): Autor
            {
                val endereco = Endereco(enderecoResponse, numero, cep)
                return Autor(nome, email, descricao, endereco)
            }
}
