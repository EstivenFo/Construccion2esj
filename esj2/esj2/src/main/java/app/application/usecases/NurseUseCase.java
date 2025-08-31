package app.application.usecases;
 
import app.domain.model.Visit;
import app.domain.model.enuns.Role;
import app.domain.services.CreateVisit;
 
 
public class NurseUseCase {
 
	private CreateVisit createVisit;
 
	public void createVisit (Visit visit) throws Exception {
		
		createVisit.create(visit);
	}

}