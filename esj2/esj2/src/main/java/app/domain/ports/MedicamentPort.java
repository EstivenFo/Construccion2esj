package app.domain.ports;

import app.domain.model.Medicament;

public interface MedicamentPort {
	
	public Medicament findByIdMedicament(Medicament medicament) throws Exception;
	public Medicament findByMedicamentName(Medicament medicament) throws Exception;
	
	public void save(Medicament medicament) throws Exception;

}
