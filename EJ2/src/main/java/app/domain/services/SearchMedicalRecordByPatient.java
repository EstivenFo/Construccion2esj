package app.domain.services;

import app.domain.model.MedicalRecord;
import app.domain.model.Patient;
import app.domain.model.User;
import app.domain.model.enums.Role;
import app.domain.ports.MedicalRecordPort;
import app.domain.ports.PatientPort;
import java.util.List;

public class SearchMedicalRecordByPatient {
	private PatientPort PatientPort;
	private MedicalRecordPort medicalRecordPort;

	public List<MedicalRecord> search(Patient Patient, User user) throws Exception {
		Patient = PatientPort.search(Patient);
		if (Patient == null) {
			throw new Exception("debe consultar ordenes de un paciente registrado");
		}
		//Solo si es médico, se ejecuta la búsqueda de la historia clínica.
		if (user.getRole() != Role.MEDIC) {
		    throw new Exception("Solo un médico puede consultar la historia clínica.");
		}

		return medicalRecordPort.search(Patient);
	}
}