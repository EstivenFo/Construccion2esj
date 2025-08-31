package app.domain.model;

public class Procedure {

    private String orderNumber;        
    private String procedureId;        
    private int quantity;              
    private int frequency;             
    private boolean requiresSpecialist;
    private String specialistCaseId;   
    private String item;
    
	public String getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	public String getProcedureId() {
		return procedureId;
	}
	public void setProcedureId(String procedureId) {
		this.procedureId = procedureId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getFrequency() {
		return frequency;
	}
	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}
	public boolean isRequiresSpecialist() {
		return requiresSpecialist;
	}
	public void setRequiresSpecialist(boolean requiresSpecialist) {
		this.requiresSpecialist = requiresSpecialist;
	}
	public String getSpecialistCaseId() {
		return specialistCaseId;
	}
	public void setSpecialistCaseId(String specialistCaseId) {
		this.specialistCaseId = specialistCaseId;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	} 
    
    

}
