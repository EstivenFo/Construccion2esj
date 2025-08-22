package app.domain.model;

public class EmergencyContact {
	
	 private String name;
	    private String relationship;
	    private String emergencyPhone;
	    
	    public EmergencyContact(String name, String relationship, String emergencyPhone) {
	        this.name = name;
	        this.relationship = relationship;
	        this.emergencyPhone = emergencyPhone;

}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getRelationship() {
			return relationship;
		}

		public void setRelationship(String relationship) {
			this.relationship = relationship;
		}

		public String getEmergencyPhone() {
			return emergencyPhone;
		}

		public void setEmergencyPhone(String emergencyPhone) {
			this.emergencyPhone = emergencyPhone;
		}
}
