package app.domain.model;

import java.time.LocalDate;

public class Users {
    private int IdUsers;
    private String fullName;
    private String idCard;
    private String email;
    private String phone;
    private LocalDate birthDate;
    private String address;
    private Role role;   
    private String username;
    private String password;

    public Users(int IdUsers, String fullName, String idCard, String email, String phone,
                 LocalDate birthDate, String address, String username, String password, Role role) {

        this.IdUsers = IdUsers;
        this.fullName = fullName;
        this.idCard = idCard;
        this.email = email;
        this.phone = phone;
        this.birthDate = birthDate;
        this.address = address;
        this.username = username;
        this.password = password;
        this.role = role;
  
}

	public int getIdUsers() {
		return IdUsers;
	}

	public void setIdUsers(int idUsers) {
		IdUsers = idUsers;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

 public void assignCredentials (String username, String password) {
        this.username = username;
        this.password =password;
 }
 
 public boolean hasRole(Role expectedRole) {
	 return this.role.equals(expectedRole);
 }
    
}

