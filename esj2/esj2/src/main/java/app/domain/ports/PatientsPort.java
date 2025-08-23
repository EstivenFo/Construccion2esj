package app.domain.ports;

import app.domain.model.Patients; 

public interface PatientsPort {
	
	
		public void save(Patients Patients) throws Exception;
	 
		public Patients findById(Patients Patients) throws Exception;
	

}
