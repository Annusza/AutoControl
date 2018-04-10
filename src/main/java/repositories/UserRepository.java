package repositories;

import java.util.List;

import domain.User;


public interface UserRepository {

	User getUserById(Long id);

	User getUserByEmailAddress(String email);

	User getUserByUsername(String username);

	void add(User user);

	User findUser(String username, String password);
	
	User makeAdmin(Long id);
	
	User togglePremium(Long id);
	
	List<User> getUsers();
	
}
