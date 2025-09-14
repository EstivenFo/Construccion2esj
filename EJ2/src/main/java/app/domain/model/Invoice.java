package app.domain.model;

import java.time.LocalDate;

public class Invoice {
	private int invoiceId;
	private String patientName;
	private int patientAge;
	private String patientIdCard;
	private String doctorName;
	private String insuranceName;
	private String policyNumber;
	private LocalDate date;
	private double totalAmount;
	private Order order;
	public int getInvoiceId() {
		return invoiceId;
	}
	public void setInvoiceId(int invoiceId) {
		this.invoiceId = invoiceId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public int getPatientAge() {
		return patientAge;
	}
	public void setPatientAge(int patientAge) {
		this.patientAge = patientAge;
	}
	public String getPatientIdCard() {
		return patientIdCard;
	}
	public void setPatientIdCard(String patientIdCard) {
		this.patientIdCard = patientIdCard;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getInsuranceName() {
		return insuranceName;
	}
	public void setInsuranceName(String insuranceName) {
		this.insuranceName = insuranceName;
	}
	public String getPolicyNumber() {
		return policyNumber;
	}
	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	

}