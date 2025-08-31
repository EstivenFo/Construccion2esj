package app.application.usecases;
 
import app.domain.model.enuns.*;
import app.domain.model.User;
import app.domain.services.CreateUser;
 
public class UserUseCase {
 
	private CreateUser createUser;
	
	public void createNurse (User user) throws Exception {
		user.setRole(Role.NURSE);
		createUser.create(user);
	}
	
	public void createMedic (User user) throws Exception {
		user.setRole(Role.MEDIC);
		createUser.create(user);
	}
	public void createHumanResources (User user) throws Exception {
		user.setRole(Role.HUMANRESOURCES);
		createUser.create(user);
	}
	
	public void createAdminStaff (User user) throws Exception {
		user.setRole(Role.ADMINISTRATIVESTAFF);
		createUser.create(user);
	}
	
	public void createITSupport (User user) throws Exception {
		user.setRole(Role.ITSUPPORT);
		createUser.create(user);
	}
}