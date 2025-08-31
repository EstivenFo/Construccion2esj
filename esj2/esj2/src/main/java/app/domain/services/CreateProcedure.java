package app.domain.services;

import app.domain.model.Procedure;
import app.domain.ports.ProcedurePort;

public class CreateProcedure {
	
	private ProcedurePort procedurePort;
	
	public void create(Procedure procedure)throws Exception {
	 if (procedure.getOrderNumber().isEmpty() ||  procedure.getOrderNumber().length() > 6) { 
	        throw new IllegalArgumentException("el numero de orden no puede estar vacio y maximo 6 digitos ");
	   
	 }
	 procedurePort.save(procedure);
	}
}
	


