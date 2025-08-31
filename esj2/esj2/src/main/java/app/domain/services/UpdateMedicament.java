package app.domain.services;

import app.domain.model.Medicament;
import app.domain.model.enuns.Role;
import app.domain.ports.MedicamentPort;
import app.domain.model.User;

public class UpdateMedicament {
	private MedicamentPort medicamentPort;
	private User user;
 
	public void update(Medicament medicament) throws Exception {
		if (medicamentPort.findByIdMedicament(medicament) == null) {
			throw new Exception("No se puede actualizar información");
		}
		if (!user.getRole().equals(Role.ITSUPPORT)) {
			throw new Exception("No tienes los permisos para actualizar la información");
		}
		medicamentPort.save(medicament);
	}
}
