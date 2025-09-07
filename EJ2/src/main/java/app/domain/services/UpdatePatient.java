package app.domain.services;

import app.domain.model.Patient;
import app.domain.model.User;
import app.domain.model.enums.Role;
import app.domain.ports.PatientPort;

public class UpdatePatient {
    private PatientPort patientPort;

    // Ahora recibimos también el usuario que intenta actualizar
    public void update(User user, Patient patient) throws Exception {

        // Validar si existe el paciente
        if (patientPort.search(patient) == null) {
            throw new Exception("No se puede actualizar información, paciente no encontrado");
        }

        // Validar permisos del usuario
        if (!user.getRole().equals(Role.ADMINISTRATIVESTAFF)) {
            throw new Exception("No tienes los permisos para actualizar la información");
        }

        // Guardar cambios
        patientPort.save(patient);
    }
}
