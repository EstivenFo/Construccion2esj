package app.domain.ports;

import app.domain.model.User;

public interface UserPort { 
	public User findByDocument(User Users) throws Exception;
	public User findByUsername(User Users) throws Exception;
	public void save(User Users) throws Exception;
}
