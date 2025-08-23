package app.domain.ports;

import java.util.List;

import app.domain.model.Order;
import app.domain.model.Patients;

public interface ClinicaOrderPort {
	
	public Order findById(Order Order) throws Exception;
	public List<Order> findByPatients(Patients Patients)throws Exception;
	public void save(Order Order) throws Exception;

}
