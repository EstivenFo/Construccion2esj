package app.domain.model;

import java.time.LocalDate;

public class Nurse extends Users {
	
	private String shift;
	
	  public Nurse(int IdUsers, String fullName, String idCard, String email, String phone,
              LocalDate birthDate, String address, String username, String password, Role role,
              String shift) {
		  
		  super(IdUsers, fullName, idCard, email, phone, birthDate, address, username, password, role);
		  
	        this.shift = shift;
	  }

	  public String getShift() {
		  return shift;
	  }

	  public void setShift(String shift) {
		  this.shift = shift;
	  }

}
