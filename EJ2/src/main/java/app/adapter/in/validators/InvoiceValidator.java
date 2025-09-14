package app.adapter.in.validators;

import org.springframework.stereotype.Component;


@Component
public class InvoiceValidator extends SimpleValidator {

    public long invoiceIdValidator(String value) throws Exception {
        return longValidator("ID de la factura", value);
    }
    public long orderNumberIdValidator(String value) throws Exception {
        return longValidator("ID de la orden", value);
    }

    public String patientNameValidator(String value) throws Exception {
        return stringValidator("nombre del paciente", value);
    }

    public int patientAgeValidator(String value) throws Exception {
        return intValidator("edad del paciente", value);
    }

    public String patientIdCardValidator(String value) throws Exception {
        return stringValidator("cédula del paciente", value);
    }

    public String doctorNameValidator(String value) throws Exception {
        return stringValidator("nombre del doctor", value);
    }

    public String insuranceNameValidator(String value) throws Exception {
        return stringValidator("nombre del seguro", value);
    }

    public String policyNumberValidator(String value) throws Exception {
        return stringValidator("número de póliza", value);
    }

    public java.time.LocalDate dateValidator(String value) throws Exception {
        return localDateValidator("fecha de la factura", value);
    }

    public double totalAmountValidator(String value) throws Exception {
        return doubleValidator("monto total de la factura", value);
    }
}
