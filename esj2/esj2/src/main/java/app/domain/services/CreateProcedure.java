package app.domain.services;

import java.util.List;
import app.domain.model.Procedure;
import app.domain.ports.ProcedurePort;

public class CreateProcedure {

	 private final ProcedurePort procedurePort;
	  public CreateProcedure(ProcedurePort procedurePort) {
	        this.procedurePort = procedurePort;
	  }
	  public void addProcedure(Procedure procedure) {
	        procedurePort.save(procedure);
	    }
	  public Procedure getProcedureById(int id) throws Exception {
	        Procedure procedure = procedurePort.findById(id);
	        if (procedure == null) {
	            throw new Exception("El procedimiento con ID " + id + " no existe.");
	        }
	        return procedure;
	    }
	  public boolean requiresSpecialist(Procedure procedure) {
	        return procedure.isRequiresSpecialist();
	    }
	  public double calculateProcedureCost(List<Procedure> procedures) {
	        return procedures.stream()
	                .mapToDouble(Procedure::getCost)
	                .sum();
	        
   }
}
