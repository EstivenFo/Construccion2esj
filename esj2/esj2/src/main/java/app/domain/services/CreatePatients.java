package app.domain.services;

import app.domain.model.Patients;
import app.domain.model.Users;
import app.domain.ports.PatientsPort;
import app.domain.ports.UserPort;

public class CreatePatients {
	
	private UserPort UserPort;
		private PatientsPort PatientsPort;
		public void create(Patients Patients)throws Exception {
		 Users owner = UserPort.findByDocument(Patients.getOwner());
			if(owner== null) {
				throw new Exception("el paciente debe de tener un numero de documento valido");
			}
			Patients.setOwner(owner);
			PatientsPort.save(Patients);
		}
	 
	}
	


