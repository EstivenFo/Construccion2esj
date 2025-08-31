package app.domain.model;
import app.domain.model.enuns.Role;
import app.domain.model.enuns.Gender;

public class Patient {
	
		private long idCard; 
		private String fullName;
		private long birthDate;
		private Gender gender;
		private String address;
		private long phone;
		private String email;
		private String emergencyContact;
		private String emergencyContactRelationship;
		private long emergencyContactNumber;
	
		private Role role;
		public String Idphone = String.valueOf(phone);
		public String IdEmergencyContactNumber = String.valueOf(emergencyContactNumber);
		
		public String getIdEmergencyContactNumber() {
			return IdEmergencyContactNumber;
		}
		public void setIdEmergencyContactNumber(String idEmergencyContactNumber) {
			IdEmergencyContactNumber = idEmergencyContactNumber;
		}
		public String getIdphone() {
			return Idphone;
		}
		public void setIdphone(String idphone) {
			Idphone = idphone;
		}
		public long getIdCard() {
			return idCard;
		}
		public void setIdCard(long idCard) {
			this.idCard = idCard;
		}
		public String getFullName() {
			return fullName;
		}
		public void setFullName(String fullName) {
			this.fullName = fullName;
		}
		public long getBirthDate() {
			return birthDate;
		}
		public void setBirthDate(long birthDate) {
			this.birthDate = birthDate;
		}
		public Gender getGender() {
			return gender;
		}
		public void setGender(Gender gender) {
			this.gender = gender;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public long getPhone() {
			return phone;
		}
		public void setPhone(long phone) {
			this.phone = phone;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getEmergencyContact() {
			return emergencyContact;
		}
		public void setEmergencyContact(String emergencyContact) {
			this.emergencyContact = emergencyContact;
		}
		public String getEmergencyContactRelationship() {
			return emergencyContactRelationship;
		}
		public void setEmergencyContactRelationship(String emergencyContactRelationship) {
			this.emergencyContactRelationship = emergencyContactRelationship;
		}
		public long getEmergencyContactNumber() {
			return emergencyContactNumber;
		}
		public void setEmergencyContactNumber(long emergencyContactNumber) {
			this.emergencyContactNumber = emergencyContactNumber;
		}
		public Role getRole() {
			return role;
		}
		public void setRole(Role role) {
			this.role = role;
		}
	}

	
	
