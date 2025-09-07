package app.domain.model;

import java.time.LocalDateTime;
import app.domain.model.enums.Status;

public class Appointment {

	private Patient patient;
	private User Doctor;
	private LocalDateTime date;
	private String reason;
	private Status status;

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public User getDoctor() {
		return Doctor;
	}

	public void setDoctor(User doctorId) {
		Doctor = doctorId;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

}
