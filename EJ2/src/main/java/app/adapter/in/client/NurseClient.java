package app.adapter.in.client;

import java.util.Scanner;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import app.domain.model.Patient;
import app.domain.model.User;
import app.domain.model.Visit;
import app.domain.model.Order;
import app.domain.model.enums.Role;
import app.domain.services.CreateVisit;
import app.domain.services.SearchOrdenByPatient;
import app.domain.services.SearchPatient;

@Controller
public class NurseClient {

	private static final String MENU = "Ingrese una opción \n" + "1. Registrar visita \n"
			+ "2. Consultar órdenes de un paciente \n" + "3. Consultar pacientes \n" + "4. Salir";

	private static Scanner reader = new Scanner(System.in);

	@Autowired
	private CreateVisit createVisit;

	@Autowired
	private SearchOrdenByPatient searchOrdenByPatient;

	@Autowired
	private SearchPatient searchPatient;

	@Autowired
	private User nurseUser;

	public NurseClient() {
		// Por simplicidad, aquí fijo un usuario enfermera
		this.nurseUser = new User();
		nurseUser.setRole(Role.NURSE);
		nurseUser.setFullName("Nurse System User");
	}

	public void session() {
		boolean session = true;
		while (session) {
			session = menu();
		}
	}

	private boolean menu() {
		try {
			System.out.println(MENU);
			String option = reader.nextLine();
			switch (option) {
			case "1": {
				Visit visit = readVisit();
				createVisit.create(nurseUser, visit);
				System.out.println("Visita registrada correctamente.");
				return true;
			}
			case "2": {
				Patient patient = readPatient();
				List<Order> orders = searchOrdenByPatient.search(patient, nurseUser);
				System.out.println("Órdenes encontradas: ");
				for (Order order : orders) {
					System.out.println(order);
				}
				return true;
			}
			case "3": {
				Patient patient = readPatient();
				List<Patient> patients = searchPatient.search(patient, nurseUser);
				System.out.println("Pacientes encontrados: ");
				for (Patient p : patients) {
					System.out.println(p);
				}
				return true;
			}
			case "4": {
				System.out.println("Cerrando sesión. Hasta luego.");
				return false;
			}
			default: {
				System.out.println("Opción no válida.");
				return true;
			}
			}
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			return true;
		}
	}

	// Lectura de datos para crear una visita
	private Visit readVisit() {
		Visit visit = new Visit();
		System.out.println("Ingrese la temperatura del paciente:");
		visit.setTemperature(Double.parseDouble(reader.nextLine()));
		System.out.println("Ingrese el pulso del paciente:");
		visit.setPulse(Integer.parseInt(reader.nextLine()));
		System.out.println("Ingrese el nivel de oxígeno del paciente:");
		visit.setOxygenLevel(Integer.parseInt(reader.nextLine()));
		return visit;
	}

	// Lectura de datos para identificar a un paciente
	private Patient readPatient() {
		Patient patient = new Patient();
		System.out.println("Ingrese el ID del paciente:");
		patient.setPatientId(Long.parseLong(reader.nextLine()));
		System.out.println("Ingrese el nombre completo del paciente:");
		patient.setFullName(reader.nextLine());
		return patient;
	}
}
