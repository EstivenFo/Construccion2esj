package app.adapter.in.builder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import app.adapter.in.validators.UserValidator;
import app.domain.model.User;
import app.domain.model.enums.Role;
import app.domain.model.enums.Gender;

@Component
public class UserBuilder {

	@Autowired
	private UserValidator userValidator;

	public User build(String fullName, String idCard, String email, String phone, String birthDate, String address,
			Role role, Gender gender) throws Exception {

		User user = new User();
		user.setFullName(userValidator.fullNameValidator(fullName));
		user.setIdCard(userValidator.idCardValidator(idCard));
		user.setEmail(userValidator.emailValidator(email));
		user.setPhone(userValidator.phoneValidator(phone));
		user.setBirthDate(userValidator.birthDateValidator(birthDate));
		user.setAddress(userValidator.addressValidator(address));
		user.setRole(role);
		user.setGender(gender);

		return user;
	}
}
