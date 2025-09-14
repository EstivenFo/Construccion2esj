package app.domain.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.domain.model.Invoice;
import app.domain.model.enums.Role;
import app.domain.ports.InvoicePort;
import app.domain.model.User;

@Service
public class CreateInvoice {
	@Autowired
	private InvoicePort invoicePort;

	// Crear y guardar una nueva factura
	public void create(Invoice invoice, User user) throws Exception {
		if (invoice == null) {
			throw new IllegalArgumentException("La factura no puede ser nula.");
		}
		if (invoice.getTotalAmount() <= 0) {
			throw new IllegalArgumentException("El monto total debe ser mayor que 0.");
		}
		if (invoice.getPatientName() == null || invoice.getPatientName().isEmpty()) {
			throw new IllegalArgumentException("El nombre del paciente es obligatorio.");
		}

		// Validar rol
		if (user.getRole() != Role.ADMINISTRATIVESTAFF) {
			throw new IllegalAccessException("Solo el personal administrativo puede crear factura.");
		}
		// Guardar la factura
		invoicePort.save(invoice);
	}
}