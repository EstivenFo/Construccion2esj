package app.domain.services;

import app.domain.model.Visit;
import app.domain.model.User;
import app.domain.ports.VisitPort;
import app.domain.model.enums.Role;

public class CreateVisit {

	private VisitPort visitPort;

	// Método para crear una visita
	public void create(User user,Visit visit) throws Exception {
		if (visit == null) {
			throw new IllegalArgumentException("La visita no puede ser nula");
		}

		// Validaciones básicas
		if (visit.getTemperature() < 30 || visit.getTemperature() > 45) {
			throw new IllegalArgumentException("Temperatura fuera de rango válido");
		}

		if (visit.getPulse() <= 0) {
			throw new IllegalArgumentException("El pulso debe ser mayor a 0");
		}

		if (visit.getOxygenLevel() < 50 || visit.getOxygenLevel() > 100) {
			throw new IllegalArgumentException("Nivel de oxígeno fuera de rango válido (50-100%)");
		}
        if (!user.getRole().equals(Role.NURSE)) {
            throw new Exception("No tienes los permisos para registrar la información");
        }
		// Guardar en el repositorio
		visitPort.save(visit);
	}
}
