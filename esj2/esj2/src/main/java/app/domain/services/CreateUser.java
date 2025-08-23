package app.domain.services;

import app.domain.model.Users;
import app.domain.ports.UserPort;

public class CreateUser {
	 
	private UserPort UserPort;
	
	public void create(Users Users) throws Exception {
		if (UserPort.findByDocument(Users) != null) {
			throw new Exception("ya existe un usuario registrado con esa cedula");
		}
		if (UserPort.finByUsername(Users) != null) {
			throw new Exception ("ya existe una persona registrado con ese nombre de usuario");
		}
		UserPort.save(Users);
	}

}
