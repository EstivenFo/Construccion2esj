package app.domain.services;
 
import app.domain.model.Patient;
import app.domain.model.enuns.Role;
import app.domain.ports.PatientPort;
 
public class UpdatePatients {
	private PatientPort patientPort;
 
	public void update(Patient patient) throws Exception {
		if (patientPort.findByDocument(patient) == null) {
			throw new Exception("No se puede actualizar información");
		}
		
		if (!patient.getRole().equals(Role.ADMINISTRATIVESTAFF)) {
			throw new Exception("No tienes los permisos para actualizar la información");
		}
		patientPort.save(patient);
	}
}