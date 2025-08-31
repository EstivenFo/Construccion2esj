package app.domain.model;

public class Medicament {
	private long medicalOrderNumber;
	private long  idMedicament;
	private String medicamentName;
	private String dose; //dosis
	private String durationTreatment;
	private long item; //número al que hace referencia dentro de la orden
	
	public long getMedicalOrderNumber() {
		return medicalOrderNumber;
	}
	public void setMedicalOrderNumber(long medicalOrderNumber) {
		this.medicalOrderNumber = medicalOrderNumber;
	}
	public long getIdMedicament() {
		return idMedicament;
	}
	public void setIdMedicament(long idMedicament) {
		this.idMedicament = idMedicament;
	}
	public String getMedicamentName() {
		return medicamentName;
	}
	public void setMedicamentName(String medicamentName) {
		this.medicamentName = medicamentName;
	}
	public String getDose() {
		return dose;
	}
	public void setDose(String dose) {
		this.dose = dose;
	}
	public String getDurationTreatment() {
		return durationTreatment;
	}
	public void setDurationTreatment(String durationTreatment) {
		this.durationTreatment = durationTreatment;
	}
	public long getItem() {
		return item;
	}
	public void setItem(long item) {
		this.item = item;
	}
	
}

