package domain;

import java.io.Serializable;

import javax.persistence.Entity;

/**
 * Entity implementation class for Entity: Player
 *
 */
@Entity
public class Admin extends User implements Serializable {

	private String  token = "";
	private static final long serialVersionUID = 1L;

	public Admin() {
		super();
	}

	public Admin(String name, String login, String password) {
		this.setName(name);
		this.setLogin(login);
		this.setPassword(password);
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	

}
