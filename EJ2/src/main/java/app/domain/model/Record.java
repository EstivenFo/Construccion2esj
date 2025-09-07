package app.domain.model;

import java.time.LocalDateTime;
import java.util.List;

public class Record {
	private String doctorId; // Identifica al médico responsable
	private LocalDateTime dateTime; // Fecha y hora de la atención
	private String diagnosis; // Diagnóstico realizado
	private String treatment; // Plan de tratamiento
	private List<String> tests; // Lista de resultados de pruebas
	private List<String> prescriptions; // Lista de medicamentos recetados
	private String notes;

	public String getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}

	public String getDiagnosis() {
		return diagnosis;
	}

	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}

	public String getTreatment() {
		return treatment;
	}

	public void setTreatment(String treatment) {
		this.treatment = treatment;
	}

	public List<String> getTests() {
		return tests;
	}

	public void setTests(List<String> tests) {
		this.tests = tests;
	}

	public List<String> getPrescriptions() {
		return prescriptions;
	}

	public void setPrescriptions(List<String> prescriptions) {
		this.prescriptions = prescriptions;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

}
