package app.domain.model;
import app.domain.model.enuns.Role;
public class User {
	
	private String fullName;
	private long idCard; 
	private String email;
	private long phone;
	private long birthDate;
	private String address;
	private Role role;
	private String gender;
	
	public String userName;
	public String password;
	public String idCardString = String.valueOf(idCard);
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public long getIdCard() {
		
		return idCard;
	}
	public String getIdCardString() {
		return idCardString;
	}
	public void setIdCardString(String idCardString) {
		this.idCardString = idCardString;
	}
	public void setIdCard(long idCard) {
		this.idCard = idCard;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public long getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(long birthDate) {
		this.birthDate = birthDate;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	
	
}
