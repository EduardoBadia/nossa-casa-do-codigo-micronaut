package br.com.zup.projetoexemplomicronaut.model

import br.com.zup.projetoexemplomicronaut.controller.response.EnderecoResponse
import javax.persistence.Embeddable

@Embeddable
class Endereco(enderecoResponse: EnderecoResponse, val numero: String, val cep: String) {

    // O fluxo se dá assim: Request -> cep de uma api externa -> EnderecoResponse -> Endereco -> Autor
    val logradouro = enderecoResponse.logradouro
    val localidade = enderecoResponse.localidade
    val uf = enderecoResponse.uf
}
