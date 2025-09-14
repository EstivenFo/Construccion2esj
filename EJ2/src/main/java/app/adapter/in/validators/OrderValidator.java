package app.adapter.in.validators;

import org.springframework.stereotype.Component;

@Component
public class OrderValidator extends SimpleValidator {

    public int orderNumberValidator(String value) throws Exception {
        return intValidator("número de la orden", value);
    }

    public String patientIdValidator(String value) throws Exception {
        return stringValidator("ID del paciente", value);
    }

    public String doctorIdValidator(String value) throws Exception {
        return stringValidator("ID del doctor", value);
    }

    public java.time.LocalDate creationDateValidator(String value) throws Exception {
        return localDateValidator("fecha de creación", value);
    }
}
