package app.domain.model;

public class Medicament {


    private int IdMedicament;
    private String name;
    private String dosage;    
    private String duration; 
    private double cost;
    
    public Medicament(int IdMedicament, String name, String dosage, String duration, double cost) {
        this.IdMedicament = IdMedicament;
        this.name = name;
        this.dosage = dosage;
        this.duration = duration;
        this.cost = cost;
    }

	public int getIdMedicament() {
		return IdMedicament;
	}

	public void setIdMedicament(int idMedicament) {
		IdMedicament = idMedicament;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDosage() {
		return dosage;
	}

	public void setDosage(String dosage) {
		this.dosage = dosage;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}
    
}
