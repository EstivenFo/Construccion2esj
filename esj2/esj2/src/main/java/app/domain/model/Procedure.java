package app.domain.model;

public class Procedure {

	private int procedureId;
    private String name;
    private int quantity;              
    private String frequency;          
    private boolean requiresSpecialist;
    private String specialistType;     
    private double cost;
    
    public Procedure(int procedureId, String name, int quantity, String frequency,
            boolean requiresSpecialist, String specialistType, double cost) {
this.procedureId = procedureId;
this.name = name;
this.quantity = quantity;
this.frequency = frequency;
this.requiresSpecialist = requiresSpecialist;
this.specialistType = specialistType;
this.cost = cost;
    }

	public int getProcedureId() {
		return procedureId;
	}

	public void setProcedureId(int procedureId) {
		this.procedureId = procedureId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getFrequency() {
		return frequency;
	}

	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}

	public boolean isRequiresSpecialist() {
		return requiresSpecialist;
	}

	public void setRequiresSpecialist(boolean requiresSpecialist) {
		this.requiresSpecialist = requiresSpecialist;
	}

	public String getSpecialistType() {
		return specialistType;
	}

	public void setSpecialistType(String specialistType) {
		this.specialistType = specialistType;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}
    
}
