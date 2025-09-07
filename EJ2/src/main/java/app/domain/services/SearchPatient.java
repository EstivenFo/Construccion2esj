package app.domain.services;

import java.util.List;

import app.domain.model.Patient;
import app.domain.ports.PatientPort;
import app.domain.model.enums.Role;
import app.domain.model.User;

public class SearchPatient {

	private PatientPort patientPort;

	public List<Patient> search(Patient patient, User user) throws Exception {
		patient = patientPort.search(patient);
		if (patient == null) {
			throw new Exception("debe consultar ordenes de un paciente registrado");
		}

		// Validar rol del usuario
		if (!(user.getRole() == Role.MEDIC || user.getRole() == Role.NURSE || user.getRole() == Role.ADMINISTRATIVESTAFF
				|| user.getRole() == Role.HUMANRESOURCES)) {
			throw new Exception("Solo médicos, enfermeras, personal administrativo o RRHH pueden consultar pacientes.");
		}

		return patientPort.searchPatient(patient); // Ahora el método devuelve el Patient encontrado
	}
}
