import java.util.ArrayList;
import java.util.List;

public class DbUsers {
	private List<User> users = new ArrayList<>();

	public DbUsers() {
		users.add(new User("sleyk", "slyek123"));
		users.add(new User("xyz", "userxys"));
		users.add(new User("krystina88", "h1jk23h1"));
		users.add(new User("mariank", "Aasdfkl@1"));
		users.add(new User("anna", "jh234l"));
	}

	public List<User> getUsers() {
		return users;
	}

	public void add(User user) {
		users.add(user);
	}
}
