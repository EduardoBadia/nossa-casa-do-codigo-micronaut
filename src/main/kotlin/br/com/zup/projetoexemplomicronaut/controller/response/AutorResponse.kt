package br.com.zup.projetoexemplomicronaut.controller.response

import br.com.zup.projetoexemplomicronaut.model.Autor

class AutorResponse(autor : Autor) {

    val nome = autor.nome
    val email = autor.email
    val descricao = autor.descricao
}
