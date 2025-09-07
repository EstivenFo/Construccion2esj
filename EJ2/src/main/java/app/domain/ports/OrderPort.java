package app.domain.ports;

import app.domain.model.Order;
import app.domain.model.Patient;

import java.util.List;

public interface OrderPort {

	public void save(Order order) throws Exception;

	public List<Order> search(Patient patient) throws Exception;

}
