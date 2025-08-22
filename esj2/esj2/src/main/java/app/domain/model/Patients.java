package app.domain.model;

import java.time.LocalDate;

public class Patients extends Users {
    
	private String username;     
    private String password;     
    private String gender;
    
    public Patients(int IdUsers, String fullName, String idCard, String email, String phone, LocalDate birthDate,
			String address, String username, String password, Role role, String gender) {
    	
		super(IdUsers, fullName, idCard, email, phone, birthDate, address, username, password, role);
	
        this.username = username;
        this.password = password;
        this.gender = gender;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	
   
    
    }
