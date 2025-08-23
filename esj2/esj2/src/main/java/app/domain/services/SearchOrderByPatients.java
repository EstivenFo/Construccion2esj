package app.domain.services;

import java.util.List;

import app.domain.model.Order;
import app.domain.model.Patients;
import app.domain.ports.ClinicaOrderPort;
import app.domain.ports.PatientsPort;

public class SearchOrderByPatients {
	
	private PatientsPort PatientsPort;
	private ClinicaOrderPort clinicalOrderPort;
 
	public List<Order> search(Patients Patients) throws Exception {
		Patients = PatientsPort.findById(Patients);
		if (Patients == null) {
			throw new Exception("debe consultar ordenes de una paciente registrado");
		}
		return clinicalOrderPort.findByPatients (Patients);
 
	}
 
}


