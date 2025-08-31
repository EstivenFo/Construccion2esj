package app.domain.services;

import app.domain.model.MedicalRecord;
import app.domain.ports.MedicalRecordPort;

public class CreateMedicalRecord {

	private MedicalRecordPort medicalRecordPort;

	public void create(MedicalRecord medicalRecord) throws Exception {

		if (!medicalRecord.getIdCardDoctor().matches("\\d{1,10}")) {
			
		    throw new IllegalArgumentException("La cédula debe ser numérica y máximo de 10 dígitos.");
		}
		medicalRecordPort.save(medicalRecord);

	}
}
