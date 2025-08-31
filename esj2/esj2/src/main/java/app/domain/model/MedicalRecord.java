package app.domain.model;

public class MedicalRecord {
	
	    private String date;            
	    private String doctorId;        
	    private String consultationReason;
	    private String symptoms;
	    private String diagnosis;
	   public String IdCardDoctor = String.valueOf(doctorId);
	    
		public String getIdCardDoctor() {
		return IdCardDoctor;
	}
	   public void setIdCardDoctor(String idCardDoctor) {
		   IdCardDoctor = idCardDoctor;
	   }
		public String getDate() {
			return date;
		}
		public void setDate(String date) {
			this.date = date;
		}
		public String getDoctorId() {
			return doctorId;
		}
		public void setDoctorId(String doctorId) {
			this.doctorId = doctorId;
		}
		public String getConsultationReason() {
			return consultationReason;
		}
		public void setConsultationReason(String consultationReason) {
			this.consultationReason = consultationReason;
		}
		public String getSymptoms() {
			return symptoms;
		}
		public void setSymptoms(String symptoms) {
			this.symptoms = symptoms;
		}
		public String getDiagnosis() {
			return diagnosis;
		}
		public void setDiagnosis(String diagnosis) {
			this.diagnosis = diagnosis;
		}
	    

}
