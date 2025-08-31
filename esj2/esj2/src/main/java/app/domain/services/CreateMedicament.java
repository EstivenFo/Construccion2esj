package app.domain.services;

import app.domain.model.Medicament;
import app.domain.ports.MedicamentPort;

public class CreateMedicament {
	private MedicamentPort medicamentPort;
	 
	public void create(Medicament medicament) throws Exception {
		if (medicamentPort.findByMedicamentName(medicament) != null) {
			throw new Exception("ya existe un Medicamento registrado con ese nombre");
 
		}
 
	}

}
