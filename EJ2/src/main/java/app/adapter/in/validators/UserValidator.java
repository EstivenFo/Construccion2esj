package app.adapter.in.validators;

import org.springframework.stereotype.Component;

@Component
public class UserValidator extends SimpleValidator {

    public String fullNameValidator(String value) throws Exception {
        return stringValidator("Nombre completo", value);
    }

    public String idCardValidator(String value) throws Exception {
        return stringValidator("Cédula de identidad", value);
    }

    public String emailValidator(String value) throws Exception {
        String email = stringValidator("Correo electrónico", value);
        if (!email.contains("@") || !email.contains(".")) {
            throw new Exception("Correo electrónico inválido");
        }
        return email;
    }

    public long phoneValidator(String value) throws Exception {
        return longValidator("Número de teléfono", value);
    }

    public long birthDateValidator(String value) throws Exception {
        return longValidator("Fecha de nacimiento (epoch o formato numérico)", value);
    }

    public String addressValidator(String value) throws Exception {
        return stringValidator("Dirección", value);
    }

    public String roleValidator(String value) throws Exception {
        return stringValidator("Rol", value); // validación básica, después puedes mapear a Enum
    }

    public String genderValidator(String value) throws Exception {
        return stringValidator("Género", value); // validación básica, después puedes mapear a Enum
    }
}