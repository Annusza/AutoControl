package repositories;

import java.util.ArrayList;
import java.util.List;

import domain.User;

public class DummyUserRepository implements UserRepository {

	@Override
	public User getUserByEmailAddress(String email) {

		for (User user : FakeDb.getDb()) {
			if (user.getEmail().equalsIgnoreCase(email))
				return user;
		}
		return null;
	}

	@Override
	public User getUserByUsername(String username) {

		for (User user : FakeDb.getDb()) {
			if (user.getUsername().equalsIgnoreCase(username))
				return user;
		}
		return null;
	}

	@Override
	public void add(User user) {
		
		
		FakeDb.add(user);

	}

	@Override
	public User findUser(String username, String password) {

		System.out.println(FakeDb.getDb());
		for (User user : FakeDb.getDb()) {
			if (user.getPassword().equalsIgnoreCase(password) && user.getUsername().equalsIgnoreCase(username)) {
				return user;
			}
		}
		return null;
	}

	@Override
	public User makeAdmin(Long id) {
		
	User userById = getUserById(id);
	userById.setAdmin(true);
	

		return userById;
	}

	@Override
	public User togglePremium(Long id) {

		User userById = getUserById(id);
		boolean last = Boolean.TRUE.equals(userById.getPremium());
		userById.setPremium(!last);
		

			return userById;
	}

	@Override
	public List<User> getUsers() {

		return new ArrayList<User>(FakeDb.getDb());

	}

	@Override
	public User getUserById(Long id) {
		
		
		for (User user : FakeDb.getDb()) {
			if (user.getId().equals(id))
				return user;
		}
		return null;
	}
	

}
