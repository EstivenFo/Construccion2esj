package app.domain.services;

import java.time.LocalDateTime;
import java.util.List;
import app.domain.model.Appointment;
import app.domain.ports.AppointmentPort;
import app.domain.model.enums.Role;
import app.domain.model.User;

public class CreateAppointment {

	private AppointmentPort appointmentPort;

	// Crear una nueva cita
	public void create(Appointment appointment, User user) throws Exception {
		// Validar que el objeto no sea nulo
		if (appointment == null) {
			throw new IllegalArgumentException("La cita no puede ser nula");
		}

		// Validar fecha de la cita
		LocalDateTime appointmentDate = appointment.getDate();
		if (appointmentDate == null || appointmentDate.isBefore(LocalDateTime.now())) {
			throw new Exception("La fecha de la cita no es válida");
		}

		// Validar que el doctor no tenga otra cita en la misma fecha/hora
		List<Appointment> doctorAppointments = appointmentPort.searchByDoctorId(appointment.getDoctor());

		for (Appointment appt : doctorAppointments) {
			if (appt.getDate().equals(appointmentDate)) {
				throw new Exception("El doctor ya tiene una cita en esa fecha y hora");
			}
			if (!(user.getRole() == Role.MEDIC || user.getRole() == Role.HUMANRESOURCES)) {
			    throw new SecurityException("Solo el personal administrador puede crear citas");
			}
		}

		// Guardar la cita
		appointmentPort.save(appointment);
	}
}
