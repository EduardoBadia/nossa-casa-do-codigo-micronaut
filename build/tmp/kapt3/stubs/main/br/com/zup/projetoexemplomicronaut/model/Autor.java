package br.com.zup.projetoexemplomicronaut.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\"\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u000e\u00a8\u0006\u001c"}, d2 = {"Lbr/com/zup/projetoexemplomicronaut/model/Autor;", "", "nome", "", "email", "descricao", "endereco", "Lbr/com/zup/projetoexemplomicronaut/model/Endereco;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbr/com/zup/projetoexemplomicronaut/model/Endereco;)V", "criadoEm", "Ljava/time/LocalDateTime;", "getCriadoEm", "()Ljava/time/LocalDateTime;", "getDescricao", "()Ljava/lang/String;", "setDescricao", "(Ljava/lang/String;)V", "getEmail", "getEndereco", "()Lbr/com/zup/projetoexemplomicronaut/model/Endereco;", "id", "", "getId", "()Ljava/lang/Long;", "setId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getNome", "projeto-exemplo-micronaut"})
@javax.persistence.Entity
public final class Autor {
    @org.jetbrains.annotations.Nullable
    @javax.persistence.GeneratedValue
    @javax.persistence.Id
    private java.lang.Long id;
    @org.jetbrains.annotations.NotNull
    private final java.time.LocalDateTime criadoEm = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String nome = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String email = null;
    @org.jetbrains.annotations.NotNull
    private java.lang.String descricao;
    @org.jetbrains.annotations.NotNull
    @javax.persistence.Embedded
    private final br.com.zup.projetoexemplomicronaut.model.Endereco endereco = null;
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Long getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.Nullable
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.time.LocalDateTime getCriadoEm() {
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
    
    public final void setDescricao(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final br.com.zup.projetoexemplomicronaut.model.Endereco getEndereco() {
        return null;
    }
    
    public Autor(@org.jetbrains.annotations.NotNull
    java.lang.String nome, @org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    java.lang.String descricao, @org.jetbrains.annotations.NotNull
    br.com.zup.projetoexemplomicronaut.model.Endereco endereco) {
        super();
    }
}