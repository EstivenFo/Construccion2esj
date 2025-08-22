package app.domain.model;

import java.time.LocalDate;

public class MedicalInsurance {
	 private String companyName;
	    private String policyNumber;
	    private boolean status;   
	    private LocalDate validity; 

	    // Constructor
	    public MedicalInsurance(String companyName, String policyNumber, boolean status, LocalDate validity) {
	        this.companyName = companyName;
	        this.policyNumber = policyNumber;
	        this.status = status;
	        this.validity = validity;
}

		public String getCompanyName() {
			return companyName;
		}

		public void setCompanyName(String companyName) {
			this.companyName = companyName;
		}

		public String getPolicyNumber() {
			return policyNumber;
		}

		public void setPolicyNumber(String policyNumber) {
			this.policyNumber = policyNumber;
		}

		public boolean isStatus() {
			return status;
		}

		public void setStatus(boolean status) {
			this.status = status;
		}

		public LocalDate getValidity() {
			return validity;
		}

		public void setValidity(LocalDate validity) {
			this.validity = validity;
		}
	    
}
