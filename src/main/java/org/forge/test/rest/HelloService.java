package org.forge.test.rest;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import java.util.Date;
import java.util.UUID;

@Path("/greet")
public class HelloService {

	@GET
	@Produces("text/plain")
	@Path("/{user}")
	public Response doGet(@PathParam("user") String user) {
		return Response.ok("Hello " + user).build();
	}
}
