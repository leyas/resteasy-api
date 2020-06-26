import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/book-service")
public class BookService {

	DbBooks db = new DbBooks();
	
	@GET
    @Path("/books/{name}")
    @Produces(MediaType.APPLICATION_JSON)
	public Book getBookByName(@PathParam("name") String name) {	
		return db.getBookByName(name);
	}
}
