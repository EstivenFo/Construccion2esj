package app.domain.model;

import app.domain.model.enuns.PolicyStatus;

public class MedicalInsurance{

	    private String insuranceCompany;   
	    private Patient patient;          
	    private String policyNumber;       
	    private PolicyStatus policystatus;
	    private boolean active;
	    
		public boolean isActive() {
			return active;
		}
		public void setActive(boolean active) {
			this.active = active;
		}
		public String getInsuranceCompany() {
			return insuranceCompany;
		}
		public void setInsuranceCompany(String insuranceCompany) {
			this.insuranceCompany = insuranceCompany;
		}
		public Patient getPatient() {
			return patient;
		}
		public void setPatient(Patient patient) {
			this.patient = patient;
		}
		public String getPolicyNumber() {
			return policyNumber;
		}
		public void setPolicyNumber(String policyNumber) {
			this.policyNumber = policyNumber;
		}
		public PolicyStatus getPolicystatus() {
			return policystatus;
		}
		public void setPolicystatus(PolicyStatus policystatus) {
			this.policystatus = policystatus;
		}
	    
	    
		
	}

