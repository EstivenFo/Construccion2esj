package app.domain.ports;

import app.domain.model.Procedure;
import java.util.List;

public interface ProcedurePort {

	 void save(Procedure procedure);
	 Procedure findById(int id);
	 List<Procedure> findAll();
	 List<Procedure> findBySpecialistType(String specialistType);
	
}
