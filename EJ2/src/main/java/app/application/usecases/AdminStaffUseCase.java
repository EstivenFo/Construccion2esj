package app.application.usecases;

import app.domain.model.Patient;
import app.domain.services.UpdatePatient;
import app.domain.services.CreatePatient;
import app.domain.services.CreateInvoice;
import app.domain.model.Invoice;
import app.domain.model.Appointment;
import app.domain.services.CreateAppointment;

public class AdminStaffUseCase {

	private CreatePatient createPatient;

	public void createPatient(Patient patient) throws Exception {
		createPatient.create(patient, null);

	}

	private UpdatePatient updatePatient;

	public void updatePatient(Patient patient) throws Exception {
		updatePatient.update(null, patient);
	}

	private CreateAppointment createAppointment;

	public void createAppointmet(Appointment appointment) throws Exception {
		createAppointment.create(appointment, null);
	}

	private CreateInvoice createInvoice;

	public void createInvoice(Invoice invoice) throws Exception {
		createInvoice.create(invoice, null);
	}

}
