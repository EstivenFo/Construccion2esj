package app.application.usecases;
 
import app.domain.model.Patient;
import app.domain.model.enuns.Role;
import app.domain.services.CreatePatients;
import app.domain.services.UpdatePatients;
 
public class AdminStaffUseCase {
 
	private CreatePatients createPatient;
 
	public void createPatient(Patient patient) throws Exception {
		patient.setRole(Role.PATIENTS);
		createPatient.create(patient);
	}
 
	private UpdatePatients updatePatient;
 
	public void updatePatient(Patient patient) throws Exception {
		updatePatient.update(patient);
	}
 
}