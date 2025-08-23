package app.domain.services;

import app.domain.model.Medicament;
import app.domain.ports.MedicationPort;
import java.util.List;

public class MedicamentService {
	
	private final MedicationPort medicationPort;
	
	public MedicamentService(MedicationPort medicationPort) {
        this.medicationPort = medicationPort;
    }
	
	 public void addMedication(Medicament Medicament) {
	        medicationPort.save(Medicament);
	    }
	 
	 public Medicament getMedicationById(int id) {
	        return medicationPort.findById(id);
	    }
	 public List<Medicament> getMedicationsByPatient(String patientId) {
	        return medicationPort.findByPatient(patientId);
	    }
	    public double calculateTreatmentCost(List<Medicament> medications) {
	        return medications.stream()
	                .mapToDouble(Medicament::getCost)
	                .sum();
	    }


}
