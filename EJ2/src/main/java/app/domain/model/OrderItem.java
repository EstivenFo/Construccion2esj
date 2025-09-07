package app.domain.model;

public class OrderItem {
    private String type;          // "Medicamento", "Procedimiento", "Ayuda"
    private String description;   // Descripción general (ej: "Paracetamol 500mg")
    private String details;       // Detalle (ej: "Cada 8 horas vía oral")

    public OrderItem(String type, String description, String details) {
        this.type = type;
        this.description = description;
        this.details = details;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
