package app.domain.services;

import app.domain.model.User;
import app.domain.model.enuns.Role;
import app.domain.ports.UserPort;

public class CreateUser {

	private UserPort userPort;
	
	public void create(User user) throws Exception {
				
		if (userPort.findByDocument(user) != null) {
			throw new Exception("ya existe una persona registrada con esa cedula");
		}

		if (!user.getRole().equals(Role.PATIENTS) && userPort.findByUsername(user) != null) {
			throw new Exception("ya existe una persona registrada con ese nombre de usuario");
		}
		if (user.getFullName() == null || user.getFullName().isEmpty()) {
	        throw new IllegalArgumentException("El nombre completo no puede estar vacío");
	    }
	    if (user.getIdCardString().isEmpty() ||  user.getIdCardString().length() > 8) { 
	        throw new IllegalArgumentException("La cédula no puede estar vacía ");
	    }
	    if (user.getUserName().length() == 0 || user.getUserName().isEmpty() || user.getUserName().length() < 15) {
	        throw new IllegalArgumentException("El nombre de usuario no puede estar vacío y debe tener minimo 15 caracteres");
	    }
	    if (user.getPassword() == null || user.getPassword().isEmpty()) {
	        throw new IllegalArgumentException("La contraseña no puede estar vacía");
	    }
		if (user.getBirthDate() > 150) {  
	        throw new IllegalArgumentException("La edad no puede ser mayor a 150");
	    }
	   if (user.getAddress().length() > 30) {
		   throw new IllegalArgumentException("La dirección no puede sobrepasar los 30 caracteres.");
	   }
		
	   userPort.save(user);
	}

}
