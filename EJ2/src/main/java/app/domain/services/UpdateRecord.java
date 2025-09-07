package app.domain.services;

import app.domain.model.Record;
import app.domain.model.User;
import app.domain.model.enums.Role;
import app.domain.ports.RecordPort;

public class UpdateRecord {

    private  RecordPort recordPort;
    
    // Actualizar un registro médico (solo MEDIC puede hacerlo)
    public void updateRecord(String patientId, Record record, User user) throws Exception {
        if (record == null) {
            throw new IllegalArgumentException("El registro no puede ser nulo");
        }
        if (patientId == null || patientId.isEmpty()) {
            throw new IllegalArgumentException("El ID del paciente no puede ser nulo o vacío");
        }
        if (user == null) {
            throw new IllegalArgumentException("El usuario no puede ser nulo");
        }

        // Validación de rol
        if (user.getRole() != Role.MEDIC) {
            throw new SecurityException("Solo un médico puede actualizar un registro médico");
        }

        // Delegar la actualización
        recordPort.update(patientId, record);
    }
}
