import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/user-service")
public class UserService {

	DbUsers dbUsers = new DbUsers();
	
	@GET
	@Path("/users")
	@Produces(MediaType.APPLICATION_JSON)
	public List<User> getUsers(){
		return dbUsers.getUsers();
	}
	
	@POST
	@Path("/users")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response addUser(User user) {
		dbUsers.add(user);
        return Response.status(Response.Status.CREATED).build();
	}
}
