package app.adapter.in.builder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import app.adapter.in.validators.OrderValidator;
import app.adapter.in.validators.PatientValidator;
import app.adapter.in.validators.UserValidator;
import app.domain.model.Order;
import app.domain.model.Patient;
import app.domain.model.User;

@Component
public class OrderBuilder {
	@Autowired
	private UserValidator userValidator;
	@Autowired
	private PatientValidator patientValidator;
	@Autowired
	private OrderValidator orderValidator;

	public Order builder(String orderNumber, String patientId, String doctorId, String creationDate) throws Exception {
		Order order = new Order();
		Patient patient = new Patient();
		User doctor = new User();
		order.setOrderNumber(orderValidator.orderNumberValidator(orderNumber));
		order.setPatientId(orderValidator.patientIdValidator(patientId));
		order.setDoctorId(orderValidator.doctorIdValidator(doctorId));
		order.setCreationDate(orderValidator.creationDateValidator(creationDate));
		patient.setPatientId(patientValidator.patientIdValidator(patientId));
		doctor.setIdCard(userValidator.idCardValidator(doctorId));
		return order;

	}
}
