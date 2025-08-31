package app.application.usecases;

import app.domain.model.Medicament;
import app.domain.model.enuns.Role; //DEJAR
import app.domain.services.CreateMedicament;
import app.domain.services.UpdateMedicament;

public class ItSupportUseCase {

	private CreateMedicament createMedicament;
	 
	public void createMedicament (Medicament medicament) throws Exception {
		createMedicament.create(medicament);
	}
    private UpdateMedicament updateMedicament;
 
	public void updateMedicament(Medicament medicament) throws Exception {
		updateMedicament.update(medicament);
	}
}


