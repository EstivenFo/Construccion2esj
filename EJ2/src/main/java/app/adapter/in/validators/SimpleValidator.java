package app.adapter.in.validators;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public abstract class SimpleValidator {

    public String stringValidator(String element, String value) throws Exception {
        if (value == null || value.trim().isEmpty()) {
            throw new Exception(element + " no puede estar vacío o nulo");
        }
        return value.trim();
    }

    public int integerValidator(String element, String value) throws Exception {
        stringValidator(element, value);
        try {
            return Integer.parseInt(value.trim());
        } catch (NumberFormatException e) {
            throw new Exception(element + " debe ser un número entero válido");
        }
    }

    // Alias para integerValidator (si quieres usar "intValidator" en tus clases hijas)
    public int intValidator(String element, String value) throws Exception {
        return integerValidator(element, value);
    }

    public long longValidator(String element, String value) throws Exception {
        stringValidator(element, value);
        try {
            return Long.parseLong(value.trim());
        } catch (NumberFormatException e) {
            throw new Exception(element + " debe ser un número largo válido");
        }
    }

    public double doubleValidator(String element, String value) throws Exception {
        stringValidator(element, value);
        try {
            return Double.parseDouble(value.trim());
        } catch (NumberFormatException e) {
            throw new Exception(element + " debe ser un número decimal válido");
        }
    }

    public LocalDate localDateValidator(String element, String value) throws Exception {
        stringValidator(element, value);
        try {
            return LocalDate.parse(value.trim()); // formato ISO: yyyy-MM-dd
        } catch (DateTimeParseException e) {
            throw new Exception(element + " debe tener el formato de fecha yyyy-MM-dd");
        }
    }
}
