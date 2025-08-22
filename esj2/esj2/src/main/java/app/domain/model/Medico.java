package app.domain.model;

import java.time.LocalDate;

public class Medico extends Users {
	private String specialty;
	
	public Medico(int IdUsers, String fullName, String idCard, String email, String phone,
            LocalDate birthDate, String address, String username, String password, Role role,
            String specialty) {
		
		 super(IdUsers, fullName, idCard, email, phone, birthDate, address, username, password, role);
	        this.specialty = specialty;
	    }

	public String getSpecialty() {
		return specialty;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}
	}

