package br.com.zup.projetoexemplomicronaut.request;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001J\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dJ\t\u0010\u001e\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n\u00a8\u0006\u001f"}, d2 = {"Lbr/com/zup/projetoexemplomicronaut/request/NovoAutorRequest;", "", "nome", "", "email", "descricao", "cep", "numero", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCep", "()Ljava/lang/String;", "getDescricao", "getEmail", "getNome", "getNumero", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "paraAutor", "Lbr/com/zup/projetoexemplomicronaut/model/Autor;", "enderecoResponse", "Lbr/com/zup/projetoexemplomicronaut/controller/response/EnderecoResponse;", "toString", "projeto-exemplo-micronaut"})
@io.micronaut.core.annotation.Introspected
public final class NovoAutorRequest {
    @org.jetbrains.annotations.NotNull
    @javax.validation.constraints.NotBlank
    private final java.lang.String nome = null;
    @org.jetbrains.annotations.NotNull
    @javax.validation.constraints.Email
    @javax.validation.constraints.NotBlank
    private final java.lang.String email = null;
    @org.jetbrains.annotations.NotNull
    @javax.validation.constraints.Size(max = 400)
    @javax.validation.constraints.NotBlank
    private final java.lang.String descricao = null;
    @org.jetbrains.annotations.NotNull
    @javax.validation.constraints.NotBlank
    private final java.lang.String cep = null;
    @org.jetbrains.annotations.NotNull
    @javax.validation.constraints.NotBlank
    private final java.lang.String numero = null;
    
    @org.jetbrains.annotations.NotNull
    public final br.com.zup.projetoexemplomicronaut.model.Autor paraAutor(@org.jetbrains.annotations.NotNull
    br.com.zup.projetoexemplomicronaut.controller.response.EnderecoResponse enderecoResponse) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getNome() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getEmail() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDescricao() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCep() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getNumero() {
        return null;
    }
    
    public NovoAutorRequest(@org.jetbrains.annotations.NotNull
    java.lang.String nome, @org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    java.lang.String descricao, @org.jetbrains.annotations.NotNull
    java.lang.String cep, @org.jetbrains.annotations.NotNull
    java.lang.String numero) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final br.com.zup.projetoexemplomicronaut.request.NovoAutorRequest copy(@org.jetbrains.annotations.NotNull
    java.lang.String nome, @org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    java.lang.String descricao, @org.jetbrains.annotations.NotNull
    java.lang.String cep, @org.jetbrains.annotations.NotNull
    java.lang.String numero) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object p0) {
        return false;
    }
}