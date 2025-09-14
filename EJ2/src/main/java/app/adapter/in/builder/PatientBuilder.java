package app.adapter.in.builder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import app.adapter.in.validators.PatientValidator;
import app.adapter.in.validators.UserValidator;
import app.domain.model.Patient;
import app.domain.model.User;
import app.domain.model.enums.Gender;

@Component
public class PatientBuilder {

	@Autowired
	private PatientValidator patientValidator;

	@Autowired
	private UserValidator userValidator;

	public Patient build(String patientId, String fullName, String birthDate, Gender gender, String address,
			String phone, String email, String emergencyContact, String emergencyContactRelationship,
			String emergencyContactNumber) throws Exception {

		// --- CREAR Y VALIDAR USUARIO ---
		User user = new User();
		user.setIdCard(userValidator.idCardValidator(patientId));
		user.setFullName(userValidator.fullNameValidator(fullName));
		user.setEmail(userValidator.emailValidator(email));
		user.setPhone(userValidator.phoneValidator(phone));
		user.setAddress(userValidator.addressValidator(address));

		// --- CREAR Y VALIDAR PACIENTE ---
		Patient patient = new Patient();
		patient.setUser(user);
		patient.setBirthDate(patientValidator.birthDateValidator(birthDate));
		patient.setGender(gender);
		patient.setEmergencyContact(patientValidator.emergencyContactValidator(emergencyContact));
		patient.setEmergencyContactRelationship(
				patientValidator.emergencyContactRelationshipValidator(emergencyContactRelationship));
		patient.setEmergencyContactNumber(patientValidator.emergencyContactNumberValidator(emergencyContactNumber));

		return patient;
	}
}
