package domain;

public class User {

	private Long id;

	private String username;
	private String password;
	private String email;
	private Boolean premium;
	private Boolean admin;

	public boolean isPremium() {

		return isAdmin() || Boolean.TRUE.equals(getPremium());

	}

	public boolean isAdmin() {

		return Boolean.TRUE.equals(getAdmin());
	}

	public Long getId() {

		return id;
	}

	public void setId(Long id) {

		this.id = id;
	}

	public Boolean getPremium() {

		return premium;
	}

	public void setPremium(Boolean premium) {

		this.premium = premium;
	}

	public Boolean getAdmin() {

		return admin;
	}

	public void setAdmin(Boolean admin) {

		this.admin = admin;
	}

	public String getUsername() {

		return username;
	}

	public void setUsername(String username) {

		this.username = username;
	}

	public String getPassword() {

		return password;
	}

	public void setPassword(String password) {

		this.password = password;
	}

	public String getEmail() {

		return email;
	}

	public void setEmail(String email) {

		this.email = email;
	}

	@Override
	public String toString() {

		return "User [id=" + id + ", username=" + username + ", password=" + password + ", email=" + email + ", premium=" + premium + ", admin=" + admin + "]";
	}

}
