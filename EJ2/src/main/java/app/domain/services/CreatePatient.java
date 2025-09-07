package app.domain.services;

import app.domain.model.Patient;
import app.domain.model.User;
import app.domain.model.enums.Role;
import app.domain.ports.PatientPort;

public class CreatePatient {

    private  PatientPort patientPort;

    // Método para registrar un paciente (solo ADMINISTRATIVESTAFF puede hacerlo)
    public void create(Patient patient, User user) throws Exception {
        if (patient == null) {
            throw new IllegalArgumentException("El paciente no puede ser nulo");
        }
        if (patient.getFullName() == null || patient.getFullName().isEmpty()) {
            throw new IllegalArgumentException("El nombre completo del paciente es obligatorio");
        }
        if (patient.getBirthDate() == 0) { // birthDate es long en tu modelo
            throw new IllegalArgumentException("La fecha de nacimiento es obligatoria");
        }
        if (patient.getGender() == null) {
            throw new IllegalArgumentException("El género es obligatorio");
        }

        // 🔑 Validar que solo ADMINISTRATIVESTAFF pueda crear pacientes
        if (user.getRole() != Role.ADMINISTRATIVESTAFF) {
            throw new SecurityException("Solo el personal administrativo puede registrar pacientes");
        }

        // Guardar paciente en el repositorio
        patientPort.save(patient);
    }
}
