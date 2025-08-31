package app.domain.model;

//import app.domain.model.enuns.Role;

public class Invoice {
	
		private String namePatient;
		private long agePatient;
		private String IdCardPatient;
		private String medicName;
		private String companyInsuranceName;
		private String policyNumber;
		private String vigencyPolicy;
		private String finalVigencyPolicy;
		
		
		public String getNamePatient() {
			return namePatient;
		}
		public void setNamePatient(String namePatient) {
			this.namePatient = namePatient;
		}
		public long getAgePatient() {
			return agePatient;
		}
		public void setAgePatient(long agePatient) {
			this.agePatient = agePatient;
		}
		public String getIdCardPatient() {
			return IdCardPatient;
		}
		public void setIdCardPatient(String idCardPatient) {
			IdCardPatient = idCardPatient;
		}
		public String getMedicName() {
			return medicName;
		}
		public void setMedicName(String medicName) {
			this.medicName = medicName;
		}
		public String getCompanyInsuranceName() {
			return companyInsuranceName;
		}
		public void setCompanyInsuranceName(String companyInsuranceName) {
			this.companyInsuranceName = companyInsuranceName;
		}
		public String getPolicyNumber() {
			return policyNumber;
		}
		public void setPolicyNumber(String policyNumber) {
			this.policyNumber = policyNumber;
		}
		public String getVigencyPolicy() {
			return vigencyPolicy;
		}
		public void setVigencyPolicy(String vigencyPolicy) {
			this.vigencyPolicy = vigencyPolicy;
		}
		public String getFinalVigencyPolicy() {
			return finalVigencyPolicy;
		}
		public void setFinalVigencyPolicy(String finalVigencyPolicy) {
			this.finalVigencyPolicy = finalVigencyPolicy;
		}
		

}
