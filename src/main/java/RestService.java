import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/rest")
public class RestService extends Application {
	private Set<Object> singletons = new HashSet<Object>();

	public RestService() {
        singletons.add(new BookService());
        singletons.add(new UserService());
    }

	@Override
	public Set<Object> getSingletons() {
		return singletons;
	}
}
