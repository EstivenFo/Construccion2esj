package app.domain.ports;

import app.domain.model.MedicalRecord;
import app.domain.model.Patient;

import java.util.List;


public interface MedicalRecordPort {

	public MedicalRecord search(MedicalRecord medicalRecord) throws Exception;

	public List<MedicalRecord> search(Patient patient)throws Exception;
	
	public void save(MedicalRecord medicalRecord) throws Exception;

}
