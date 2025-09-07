package app.application.usecases;

import app.domain.services.CreateUser;
import app.domain.services.UpdateUser;
import app.domain.model.User;

public class HumanResourcesUseCase {

	private CreateUser createUser;

	public void createUser(User user) throws Exception {
		createUser.createUser(user);
	}

	private UpdateUser updateUser;

	public void updateUser(User user) throws Exception {
		updateUser.update(user);
	}
}
