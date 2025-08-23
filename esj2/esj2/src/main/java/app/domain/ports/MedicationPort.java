package app.domain.ports;

import app.domain.model.Medicament;
import java.util.List;

public interface MedicationPort {
	
	    void save(Medicament Medicament);

	    Medicament findById(int id);

	    List<Medicament> findByPatient(String patientId);

	    List<Medicament> findAll();
	}


