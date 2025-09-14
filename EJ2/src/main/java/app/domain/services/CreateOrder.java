package app.domain.services;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.domain.model.Order;
import app.domain.model.OrderItem;
import app.domain.ports.OrderPort;
import app.domain.model.enums.Role;
import app.domain.model.User;

@Service
public class CreateOrder {
	@Autowired
	private OrderPort orderPort;

	public void create(String patientId, String doctorId, boolean requiresHospitalization, User user, Order order)
			throws Exception {

		if (patientId == null || patientId.isEmpty()) {
			throw new IllegalArgumentException("El paciente es obligatorio");
		}
		  
		if (doctorId == null || doctorId.isEmpty()) {
			throw new IllegalArgumentException("El doctor es obligatorio");

		}

		if (user.getRole() != Role.MEDIC) {
			throw new SecurityException("Solo un médico puede crear una orden médica");
		}
		order.setPatientId(patientId);
		order.setDoctorId(doctorId);
		order.setCreationDate(LocalDate.now());

		// Hospitalización como procedimiento (si aplica)
		if (requiresHospitalization) {
			order.addItem(new OrderItem("Procedimiento", "Hospitalización del paciente",
					"Ingreso en sala general bajo observación continua"));
		}

		// Procedimientos de enfermería
		order.addItem(new OrderItem("Procedimiento", "Visita de enfermería", "Control de signos vitales cada 4 horas"));
		order.addItem(new OrderItem("Procedimiento", "Intervenciones de enfermería",
				"Administración de medicamentos y cuidado general"));

		// Medicamentos recetados
		order.addItem(new OrderItem("Medicamento", "Paracetamol 500mg", "Cada 8 horas vía oral"));
		order.addItem(new OrderItem("Medicamento", "Amoxicilina 875mg", "Cada 12 horas vía oral durante 7 días"));
		order.addItem(new OrderItem("Medicamento", "Solución salina 0.9%", "Aplicación intravenosa según necesidad"));

		// Ayuda diagnóstica
		order.addItem(new OrderItem("Ayuda", "Radiografía de tórax", "Evaluar estado pulmonar"));

		// Guardar en el repositorio
		orderPort.save(order);
	}

}
