package org.acme.nts;


import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

import java.util.ArrayList;
import java.util.List;

@Path("/Autor")
public class Autor_Resource {

    List<Autor_> autores = new ArrayList<>();

    @GET
    public List<Autor_> getTodosAutores(){
        return autores;
    }

    @POST
    public String postNovoAutor(Autor_ autor){
        autores.add(autor);
        return "Autor cadastrado com sucesso!";
    }


}
