package br.com.zup.projetoexemplomicronaut.repository

import br.com.zup.projetoexemplomicronaut.model.Autor
import io.micronaut.data.annotation.Repository
import io.micronaut.data.jpa.repository.JpaRepository
import java.util.*

@Repository
public interface  AutorRepository : JpaRepository<Autor, Long> {

    fun findByEmail(email: String): Optional<Autor>
}