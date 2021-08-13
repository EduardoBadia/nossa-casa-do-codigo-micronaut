package br.com.zup;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\r\u0010!\u001a\u00020\"H\u0001\u00a2\u0006\u0002\b#J\r\u0010$\u001a\u00020\"H\u0001\u00a2\u0006\u0002\b%J\b\u0010&\u001a\u00020\u0016H\u0007J\r\u0010\'\u001a\u00020\"H\u0001\u00a2\u0006\u0002\b(J\r\u0010)\u001a\u00020\"H\u0001\u00a2\u0006\u0002\b*R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u001cX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 \u00a8\u0006+"}, d2 = {"Lbr/com/zup/AutorMicronautTest;", "", "()V", "autor", "Lbr/com/zup/projetoexemplomicronaut/model/Autor;", "getAutor", "()Lbr/com/zup/projetoexemplomicronaut/model/Autor;", "setAutor", "(Lbr/com/zup/projetoexemplomicronaut/model/Autor;)V", "autorRepository", "Lbr/com/zup/projetoexemplomicronaut/repository/AutorRepository;", "getAutorRepository", "()Lbr/com/zup/projetoexemplomicronaut/repository/AutorRepository;", "setAutorRepository", "(Lbr/com/zup/projetoexemplomicronaut/repository/AutorRepository;)V", "client", "Lio/micronaut/http/client/HttpClient;", "getClient", "()Lio/micronaut/http/client/HttpClient;", "setClient", "(Lio/micronaut/http/client/HttpClient;)V", "enderecoClient", "Lbr/com/zup/projetoexemplomicronaut/cliente/EnderecoClient;", "getEnderecoClient", "()Lbr/com/zup/projetoexemplomicronaut/cliente/EnderecoClient;", "setEnderecoClient", "(Lbr/com/zup/projetoexemplomicronaut/cliente/EnderecoClient;)V", "enderecoResponse", "Lbr/com/zup/projetoexemplomicronaut/controller/response/EnderecoResponse;", "getEnderecoResponse", "()Lbr/com/zup/projetoexemplomicronaut/controller/response/EnderecoResponse;", "setEnderecoResponse", "(Lbr/com/zup/projetoexemplomicronaut/controller/response/EnderecoResponse;)V", "deveBuscarUmAutorQuandoUmEmailValidoEhInformado", "", "deveBuscarUmAutorQuandoUmEmailValidoEhInformado$projeto_exemplo_micronaut", "deveCadastrarUmNovoAutor", "deveCadastrarUmNovoAutor$projeto_exemplo_micronaut", "enderecoMock", "setup", "setup$projeto_exemplo_micronaut", "tearDown", "tearDown$projeto_exemplo_micronaut", "projeto-exemplo-micronaut"})
@io.micronaut.test.extensions.junit5.annotation.MicronautTest
public final class AutorMicronautTest {
    @javax.inject.Inject
    public br.com.zup.projetoexemplomicronaut.repository.AutorRepository autorRepository;
    @javax.inject.Inject
    public br.com.zup.projetoexemplomicronaut.cliente.EnderecoClient enderecoClient;
    @io.micronaut.http.client.annotation.Client(value = "/")
    @javax.inject.Inject
    public io.micronaut.http.client.HttpClient client;
    public br.com.zup.projetoexemplomicronaut.model.Autor autor;
    public br.com.zup.projetoexemplomicronaut.controller.response.EnderecoResponse enderecoResponse;
    
    @org.jetbrains.annotations.NotNull
    public final br.com.zup.projetoexemplomicronaut.repository.AutorRepository getAutorRepository() {
        return null;
    }
    
    public final void setAutorRepository(@org.jetbrains.annotations.NotNull
    br.com.zup.projetoexemplomicronaut.repository.AutorRepository p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final br.com.zup.projetoexemplomicronaut.cliente.EnderecoClient getEnderecoClient() {
        return null;
    }
    
    public final void setEnderecoClient(@org.jetbrains.annotations.NotNull
    br.com.zup.projetoexemplomicronaut.cliente.EnderecoClient p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.micronaut.http.client.HttpClient getClient() {
        return null;
    }
    
    public final void setClient(@org.jetbrains.annotations.NotNull
    io.micronaut.http.client.HttpClient p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final br.com.zup.projetoexemplomicronaut.model.Autor getAutor() {
        return null;
    }
    
    public final void setAutor(@org.jetbrains.annotations.NotNull
    br.com.zup.projetoexemplomicronaut.model.Autor p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final br.com.zup.projetoexemplomicronaut.controller.response.EnderecoResponse getEnderecoResponse() {
        return null;
    }
    
    public final void setEnderecoResponse(@org.jetbrains.annotations.NotNull
    br.com.zup.projetoexemplomicronaut.controller.response.EnderecoResponse p0) {
    }
    
    @org.junit.jupiter.api.BeforeEach
    public final void setup$projeto_exemplo_micronaut() {
    }
    
    @org.junit.jupiter.api.AfterEach
    public final void tearDown$projeto_exemplo_micronaut() {
    }
    
    @org.junit.jupiter.api.Test
    public final void deveBuscarUmAutorQuandoUmEmailValidoEhInformado$projeto_exemplo_micronaut() {
    }
    
    @org.junit.jupiter.api.Test
    public final void deveCadastrarUmNovoAutor$projeto_exemplo_micronaut() {
    }
    
    @org.jetbrains.annotations.NotNull
    @io.micronaut.test.annotation.MockBean(value = br.com.zup.projetoexemplomicronaut.cliente.EnderecoClient.class)
    public final br.com.zup.projetoexemplomicronaut.cliente.EnderecoClient enderecoMock() {
        return null;
    }
    
    public AutorMicronautTest() {
        super();
    }
}