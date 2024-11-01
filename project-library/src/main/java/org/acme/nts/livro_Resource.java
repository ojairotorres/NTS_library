package org.acme.nts;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

import java.util.ArrayList;
import java.util.List;

@Path("/Livro")
public class livro_Resource {

    List<livro> livros = new ArrayList<>();

    @GET
    public List<livro> getTodosLivros(){
        return livros;
    }

    @POST
    public String postNovoLivro(livro livro){
        livros.add(livro);
        return "Livro cadastrado com sucesso!";
    }


}
