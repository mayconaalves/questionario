package br.com.aprendizado.funcionalidade.exemplo.service;

import br.com.aprendizado.funcionalidade.exemplo.dao.ExemploDAO;
import br.com.aprendizado.funcionalidade.exemplo.entidade.Exemplo;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/exemplo")
@LocalBean
@Stateless
public class ExemploService {

    @Inject
    private ExemploDAO dao;


    @GET
    @Path("/ping")
    public Response ping() {
        return Response.ok().entity("Service online").build();
    }

    @GET
    @Path("/get/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getNotification(@PathParam("id") int id) {
        return Response.ok()
                .entity(new Exemplo(id, "john", "test notification"))
                .build();
    }

    @POST
    @Path("/post/")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response postNotification(Exemplo exemplo) {
        return Response.status(201).entity(exemplo).build();
    }
}
