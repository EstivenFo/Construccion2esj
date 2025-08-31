package app.domain.services;

import app.domain.model.Visit;
import app.domain.ports.VisitPort;

public class CreateVisit {

	private VisitPort visitPort;
	
	public void create(Visit visit) throws Exception {

        if (visit.getBloodPressure() == null || visit.getBloodPressure().isEmpty()) {
            throw new IllegalArgumentException("La presión arterial no puede estar vacía.");
        }
        if (visit.getTemperature() < 30 || visit.getTemperature() > 45) {
            throw new IllegalArgumentException("La temperatura debe estar entre 30°C y 45°C.");
        }
        if (visit.getPulse() <= 0 || visit.getPulse() > 220) {
            throw new IllegalArgumentException("El pulso debe estar entre 1 y 220 latidos por minuto.");
        }
        if (visit.getOxygenLevel() < 50 || visit.getOxygenLevel() > 100) {
            throw new IllegalArgumentException("El nivel de oxígeno debe estar entre 50% y 100%.");

        
    }
        visitPort.save(visit);
	}
}


