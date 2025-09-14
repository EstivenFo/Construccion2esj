package app.adapter.in.validators;
import org.springframework.stereotype.Component;

@Component
public class PatientValidator extends SimpleValidator {

    public long patientIdValidator(String value) throws Exception {
        return longValidator("ID del paciente", value);
    }

    public String fullNameValidator(String value) throws Exception {
        return stringValidator("Nombre completo", value);
    }

    public long birthDateValidator(String value) throws Exception {
        return longValidator("Fecha de nacimiento (epoch o formato numérico)", value);
    }

    public String genderValidator(String value) throws Exception {
        return stringValidator("Género", value); // luego puedes mapearlo a Enum Gender.valueOf()
    }

    public String addressValidator(String value) throws Exception {
        return stringValidator("Dirección", value);
    }

    public long phoneValidator(String value) throws Exception {
        return longValidator("Teléfono", value);
    }

    public String emailValidator(String value) throws Exception {
        String email = stringValidator("Correo electrónico", value);
        if (!email.contains("@") || !email.contains(".")) {
            throw new Exception("Correo electrónico inválido");
        }
        return email;
    }

    public String emergencyContactValidator(String value) throws Exception {
        return stringValidator("Contacto de emergencia", value);
    }

    public String emergencyContactRelationshipValidator(String value) throws Exception {
        return stringValidator("Relación del contacto de emergencia", value);
    }

    public long emergencyContactNumberValidator(String value) throws Exception {
        return longValidator("Número de contacto de emergencia", value);
    }

}
