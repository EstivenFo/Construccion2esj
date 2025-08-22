package app.domain.model;


import java.time.LocalDate;

public class AdministrativeStaff extends Users{
	
	 public AdministrativeStaff(int IdUsers, String fullName, String idCard, String email, String phone,
             LocalDate birthDate, String address, String username, String password, Role role) {
		 
super(IdUsers, fullName, idCard, email, phone, birthDate, address, username, password, role);
}

}
