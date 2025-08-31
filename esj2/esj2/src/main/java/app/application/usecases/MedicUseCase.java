package app.application.usecases;

import app.domain.model.Procedure;
import app.domain.model.enuns.Role;
import app.domain.services.CreateProcedure;


public class MedicUseCase {

	private CreateProcedure createProcedure;

	public void createProcedure (Procedure procedure) throws Exception {
		createProcedure.create(procedure);
	}

}