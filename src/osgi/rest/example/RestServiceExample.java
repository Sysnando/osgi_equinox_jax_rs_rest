package osgi.rest.example;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/hello")
public class RestServiceExample {

	@GET
	public String name(){
		return "Hello Rest Service"; 
	}
}
