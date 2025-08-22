package app.domain.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
	 private int orderNumber;
	    private String patientId;
	    private String doctorId;
	    private LocalDate creationDate;
	    private List<String> items; 
	    
	    public Order(int orderNumber, String patientId, String doctorId, LocalDate creationDate) {
	        this.orderNumber = orderNumber;
	        this.patientId = patientId;
	        this.doctorId = doctorId;
	        this.creationDate = creationDate;
	        this.items = new ArrayList<>();
	    }

		public int getOrderNumber() {
			return orderNumber;
		}

		public void setOrderNumber(int orderNumber) {
			this.orderNumber = orderNumber;
		}

		public String getPatientId() {
			return patientId;
		}

		public void setPatientId(String patientId) {
			this.patientId = patientId;
		}

		public String getDoctorId() {
			return doctorId;
		}

		public void setDoctorId(String doctorId) {
			this.doctorId = doctorId;
		}

		public LocalDate getCreationDate() {
			return creationDate;
		}

		public void setCreationDate(LocalDate creationDate) {
			this.creationDate = creationDate;
		}

		public List<String> getItems() {
			return items;
		}

		public void setItems(List<String> items) {
			this.items = items;
		}
	    
	    
}
