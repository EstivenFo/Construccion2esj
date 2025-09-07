package app.application.usecases;

import app.domain.model.Patient;
import app.domain.model.Visit;
import app.domain.services.CreateVisit;
import app.domain.services.SearchPatient;
import app.domain.services.SearchOrdenByPatient;

public class NurseUseCase {

	private CreateVisit createVisit;

	public void createVisit(Visit visit) throws Exception {
		createVisit.create(null, visit);
	}

	private SearchPatient searchPatient;

	public void searchPatient(Patient patient) throws Exception {
		searchPatient.search(patient, null);
	}
	private SearchOrdenByPatient searchOrdenByPatient;

	public void searchOrdenByPatient(Patient patient) throws Exception {
		searchOrdenByPatient.search(patient, null);
	}

}
