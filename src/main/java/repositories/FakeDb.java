package repositories;

import java.util.ArrayList;
import java.util.List;

import domain.User;

public class FakeDb {

	private static List<User> db = new ArrayList<User>();
	static {
		User user1 = new User();
		user1.setUsername("Pimpek");
		user1.setPassword("Pimpek");
		user1.setEmail("pimpek@pimpek.com");
		User user2 = new User();
		user2.setUsername("Totek");
		user2.setPassword("Totek");

		User user3 = new User();
		user3.setPremium(true);
		user3.setUsername("Polcia");
		user3.setPassword("polcia");

		add(user1);
		add(user2);
		add(user3);
	}

	public static List<User> getDb() {

		return db;
	}

	public static void setDb(List<User> db) {

		FakeDb.db = db;
	}

	public static void add(User user) {

		Long id = generateId(user);
		user.setId(id);
		if (db.isEmpty()) {
			user.setAdmin(true);
		}

		db.add(user);

	}

	public static Long generateId(User user) {

		return Long.valueOf("" + (db.size() + 1));
	}

}
