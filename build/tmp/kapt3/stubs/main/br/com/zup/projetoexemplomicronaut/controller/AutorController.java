package br.com.zup.projetoexemplomicronaut.controller;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\b\b\u0001\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0017J\u0018\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\b\b\u0001\u0010\u0012\u001a\u00020\u0013H\u0017J\u0018\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\b\b\u0001\u0010\r\u001a\u00020\u000eH\u0017J\u0014\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\fH\u0017J\u0018\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\b\b\u0001\u0010\u0018\u001a\u00020\u0010H\u0017R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0019"}, d2 = {"Lbr/com/zup/projetoexemplomicronaut/controller/AutorController;", "", "autorRepository", "Lbr/com/zup/projetoexemplomicronaut/repository/AutorRepository;", "enderecoClient", "Lbr/com/zup/projetoexemplomicronaut/cliente/EnderecoClient;", "(Lbr/com/zup/projetoexemplomicronaut/repository/AutorRepository;Lbr/com/zup/projetoexemplomicronaut/cliente/EnderecoClient;)V", "getAutorRepository", "()Lbr/com/zup/projetoexemplomicronaut/repository/AutorRepository;", "getEnderecoClient", "()Lbr/com/zup/projetoexemplomicronaut/cliente/EnderecoClient;", "atualiza", "Lio/micronaut/http/HttpResponse;", "id", "", "descricao", "", "cadastra", "request", "Lbr/com/zup/projetoexemplomicronaut/request/NovoAutorRequest;", "deleta", "lista", "", "Lbr/com/zup/projetoexemplomicronaut/controller/response/AutorResponse;", "email", "projeto-exemplo-micronaut"})
@io.micronaut.http.annotation.Controller(value = "/autores")
public class AutorController {
    @org.jetbrains.annotations.NotNull
    private final br.com.zup.projetoexemplomicronaut.repository.AutorRepository autorRepository = null;
    @org.jetbrains.annotations.NotNull
    private final br.com.zup.projetoexemplomicronaut.cliente.EnderecoClient enderecoClient = null;
    
    @org.jetbrains.annotations.NotNull
    @javax.transaction.Transactional
    @io.micronaut.http.annotation.Get
    public io.micronaut.http.HttpResponse<java.util.List<br.com.zup.projetoexemplomicronaut.controller.response.AutorResponse>> lista() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.transaction.Transactional
    @io.micronaut.http.annotation.Post(produces = {"application/xml"}, consumes = {"application/xml"})
    public io.micronaut.http.HttpResponse<java.lang.Object> cadastra(@org.jetbrains.annotations.NotNull
    @javax.validation.Valid
    @io.micronaut.http.annotation.Body
    br.com.zup.projetoexemplomicronaut.request.NovoAutorRequest request) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.transaction.Transactional
    @io.micronaut.http.annotation.Put(value = "/{id}")
    public io.micronaut.http.HttpResponse<java.lang.Object> atualiza(@io.micronaut.http.annotation.PathVariable
    long id, @org.jetbrains.annotations.NotNull
    java.lang.String descricao) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.transaction.Transactional
    @io.micronaut.http.annotation.Get(value = "/obterEmailAutor")
    public io.micronaut.http.HttpResponse<java.lang.Object> lista(@org.jetbrains.annotations.NotNull
    @io.micronaut.http.annotation.QueryValue(defaultValue = "")
    java.lang.String email) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.transaction.Transactional
    @io.micronaut.http.annotation.Delete(value = "/{id}")
    public io.micronaut.http.HttpResponse<java.lang.Object> deleta(@io.micronaut.http.annotation.PathVariable
    long id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public br.com.zup.projetoexemplomicronaut.repository.AutorRepository getAutorRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public br.com.zup.projetoexemplomicronaut.cliente.EnderecoClient getEnderecoClient() {
        return null;
    }
    
    public AutorController(@org.jetbrains.annotations.NotNull
    br.com.zup.projetoexemplomicronaut.repository.AutorRepository autorRepository, @org.jetbrains.annotations.NotNull
    br.com.zup.projetoexemplomicronaut.cliente.EnderecoClient enderecoClient) {
        super();
    }
}