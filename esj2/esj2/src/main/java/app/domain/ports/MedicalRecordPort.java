package app.domain.ports;

import app.domain.model.MedicalRecord;

public interface MedicalRecordPort {
		public MedicalRecord findByDocument(MedicalRecord medicalRecord) throws Exception;
		public MedicalRecord findByUserName(MedicalRecord medicalRecord) throws Exception;
		public MedicalRecord findEmergencyContactnumber(MedicalRecord medicalRecord)throws Exception;
		public void save(MedicalRecord medicalRecord) throws Exception;
}
