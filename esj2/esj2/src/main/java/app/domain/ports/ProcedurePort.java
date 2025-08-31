package app.domain.ports;

import app.domain.model.Procedure;

public interface ProcedurePort {
	
	public Procedure  findByDocument(Procedure  procedure) throws Exception;
	public Procedure  findByUserName(Procedure  procedure) throws Exception;
	public Procedure  findEmergencyContactnumber(Procedure  procedure)throws Exception;
	public void save(Procedure  procedure) throws Exception;

}
