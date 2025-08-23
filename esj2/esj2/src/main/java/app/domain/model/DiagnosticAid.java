package app.domain.model;

public class DiagnosticAid {
	private int diagnosticAidId;
    private String name;
    private int quantity;
    private double cost;
    private boolean requiresSpecialist;
    private String specialistType;
    
    public DiagnosticAid(int diagnosticAidId, String name, int quantity, double cost) {
        this.diagnosticAidId = diagnosticAidId;
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
    }

	public int getDiagnosticAidId() {
		return diagnosticAidId;
	}

	public void setDiagnosticAidId(int diagnosticAidId) {
		this.diagnosticAidId = diagnosticAidId;
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

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
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
	
  
}
