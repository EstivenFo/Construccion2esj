package app.domain.services;

import app.domain.model.Patient;
import app.domain.model.enuns.Role;
import app.domain.ports.PatientPort;

public class CreatePatients {

	private PatientPort patientPort;
		public void create(Patient patient)throws Exception {
			if (patientPort.findByDocument(patient) != null) {
				throw new Exception("ya existe una persona registrada con esa cedula");
			}
			if (patient.getBirthDate() > 150) {  
		        throw new IllegalArgumentException("La edad no puede ser mayor a 150");
		    }
			if (!patient.getRole().equals(Role.PATIENTS) && patientPort.findByUserName(patient) != null) {
				throw new Exception("ya existe una Paciente registrado con ese nombre de usuario");
			}
			 if (patient.getGender() == null) {
			        throw new IllegalArgumentException("El género no puede ser nulo");
			    }
			 if (patient.getIdphone().length() > 10) {
				    throw new IllegalArgumentException("El número de celular debe contener exactamente 10 dígitos numéricos");
				}
			 String email = patient.getEmail();
			 if (email == null || email.isEmpty()) {
			     throw new IllegalArgumentException("El email no puede estar vacío");
			 }
			 String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

			 if (!email.matches(emailRegex)) {
			     throw new IllegalArgumentException("El email no tiene un formato válido");
			 }
			 if (patient.getAddress().length() > 30) {
				   throw new IllegalArgumentException("La dirección no puede sobrepasar los 30 caracteres.");
			   }
			 if (patient.getIdEmergencyContactNumber().length() > 10) {
				    throw new IllegalArgumentException("El número de celular debe contener exactamente 10 dígitos numéricos");
			 }
			patientPort.save(patient);
		}
		
}
	


