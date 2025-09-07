package app.domain.ports;

import app.domain.model.Record;

public interface RecordPort {
	// Guardar un registro médico
	public void save(String patientId, Record record);
	
	// Actualizar un registro médico existente
	public void update(String patientId, Record record);
}
