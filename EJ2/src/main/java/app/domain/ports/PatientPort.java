package app.domain.ports;

import java.util.List;

import app.domain.model.Patient;

public interface PatientPort {

	public Patient search(Patient patient) throws Exception;
	
	public List<Patient> searchPatient(Patient patient)throws Exception;
	
	public void search(long patientId) throws Exception;

	public void save(Patient patient) throws Exception;
}
