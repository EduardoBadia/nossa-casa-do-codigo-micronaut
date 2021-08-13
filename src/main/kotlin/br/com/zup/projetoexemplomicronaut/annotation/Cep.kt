package br.com.zup.projetoexemplomicronaut.annotation

import io.micronaut.core.annotation.AnnotationValue
import io.micronaut.validation.validator.constraints.ConstraintValidator
import io.micronaut.validation.validator.constraints.ConstraintValidatorContext
import kotlin.annotation.AnnotationTarget.FIELD
import kotlin.annotation.AnnotationTarget.CONSTRUCTOR
import kotlin.annotation.AnnotationRetention.RUNTIME
import javax.inject.Singleton
import javax.validation.Constraint

@MustBeDocumented
@Target(FIELD, CONSTRUCTOR)
@Retention(RUNTIME)
@Constraint(validatedBy = [CepValidator::class])
annotation class Cep(val message : String = "cep com formato inválido")
{

}

@Singleton
class CepValidator : ConstraintValidator<Cep, String>
{
    override fun isValid(

        value: String?,
        annotationMetadata: AnnotationValue<Cep>,
        context: ConstraintValidatorContext,
    ): Boolean {

        if(value == null)
        {
            return false
        }

        return value.matches("[0-9]{5}-[0-9]{3}".toRegex())
    }
}
