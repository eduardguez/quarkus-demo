package mx.edu.ebc.rest

import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

import mx.edu.ebc.rest.command.Greeting

@Path("/greeting")
class GreetingResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    fun hello() = Greeting("hello")
}