package app.domain.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.domain.model.Record;
import app.domain.model.User;
import app.domain.ports.RecordPort;
@Service
public class CreateRecord {
	@Autowired
    private  RecordPort recordPort;

    public void create(String patientId, Record record, User user) throws Exception {
        if (patientId == null || patientId.isEmpty()) {
            throw new IllegalArgumentException("El paciente es obligatorio");
        }
        if (record == null) {
            throw new IllegalArgumentException("El registro no puede ser nulo");
        }
        if (user == null) {
            throw new IllegalArgumentException("El usuario es obligatorio");
        }

        // validación de rol
        if (user.getRole() != app.domain.model.enums.Role.MEDIC) {
            throw new SecurityException("Solo un médico puede actualizar el registro clínico");
        }

        // aquí delegas al puerto
        recordPort.save(patientId, record);
    }
}

