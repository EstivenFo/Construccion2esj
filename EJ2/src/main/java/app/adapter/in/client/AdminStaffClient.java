package app.adapter.in.client;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import app.domain.model.Patient;
import app.domain.model.Appointment;
import app.domain.model.Invoice;
import app.domain.model.User;
import app.domain.model.enums.Gender;
import app.domain.model.enums.Role;
import app.domain.model.enums.Status;
import app.domain.services.CreatePatient;
import app.domain.services.UpdatePatient;
import app.domain.services.CreateAppointment;
import app.domain.services.CreateInvoice;

@Controller
public class AdminStaffClient {

	private static final Scanner sc = new Scanner(System.in);
	@Autowired
	private  CreatePatient createPatient;
	@Autowired
	private  UpdatePatient updatePatient;
	@Autowired
	private  CreateAppointment createAppointment;
	@Autowired
	private  CreateInvoice createInvoice;

	@Autowired
	public AdminStaffClient(CreatePatient createPatient, UpdatePatient updatePatient,
			CreateAppointment createAppointment, CreateInvoice createInvoice) {
		this.createPatient = createPatient;
		this.updatePatient = updatePatient;
		this.createAppointment = createAppointment;
		this.createInvoice = createInvoice;
	}

	private static final String MENU = """
			=== Menú Personal Administrativo ===
			1. Crear Paciente
			2. Actualizar Paciente
			3. Crear Cita
			4. Crear Factura
			0. Salir
			""";

	public void run() {
		int opcion;
		do {
			System.out.println(MENU);
			opcion = sc.nextInt();
			sc.nextLine(); // limpiar buffer

			try {
				switch (opcion) {
				case 1 -> crearPaciente();
				case 2 -> actualizarPaciente();
				case 3 -> crearCita();
				case 4 -> crearFactura();
				case 0 -> System.out.println("Saliendo...");
				default -> System.out.println("Opción inválida");
				}
			} catch (Exception e) {
				System.out.println("Error: " + e.getMessage());
			}
		} while (opcion != 0);
	}

	private void crearPaciente() throws Exception {
		Patient patient = new Patient();

		System.out.print("Nombre completo: ");
		patient.setFullName(sc.nextLine());

		System.out.print("Fecha de nacimiento (YYYYMMDD): ");
		patient.setBirthDate(sc.nextLong());
		sc.nextLine();

		System.out.print("Género (M/F): ");
		String gender = sc.nextLine().toUpperCase();
		patient.setGender(gender.equals("M") ? Gender.MALE : Gender.FEMALE);

		System.out.print("Dirección: ");
		patient.setAddress(sc.nextLine());

		System.out.print("Teléfono: ");
		patient.setPhone(sc.nextLong());
		sc.nextLine();

		System.out.print("Email: ");
		patient.setEmail(sc.nextLine());

		System.out.print("Contacto de emergencia: ");
		patient.setEmergencyContact(sc.nextLine());

		System.out.print("Parentesco contacto: ");
		patient.setEmergencyContactRelationship(sc.nextLine());

		System.out.print("Teléfono contacto: ");
		patient.setEmergencyContactNumber(sc.nextLong());
		sc.nextLine();

		User admin = buildAdminUser();
		createPatient.create(patient, admin);

		System.out.println("✅ Paciente creado con éxito.");
	}

	private void actualizarPaciente() throws Exception {
		Patient patient = new Patient();

		System.out.print("ID del paciente: ");
		patient.setPatientId(sc.nextLong());
		sc.nextLine();

		System.out.print("Nuevo nombre completo: ");
		patient.setFullName(sc.nextLine());

		System.out.print("Nueva dirección: ");
		patient.setAddress(sc.nextLine());

		System.out.print("Nuevo teléfono: ");
		patient.setPhone(sc.nextLong());
		sc.nextLine();

		System.out.print("Nuevo email: ");
		patient.setEmail(sc.nextLine());

		User admin = buildAdminUser();
		updatePatient.update(admin, patient);

		System.out.println("✅ Paciente actualizado con éxito.");
	}

	private void crearCita() throws Exception {
		Appointment appointment = new Appointment();

		System.out.print("ID del paciente: ");
		long patientId = sc.nextLong();
		sc.nextLine();

		Patient patient = new Patient();
		patient.setPatientId(patientId);
		appointment.setPatient(patient);

		System.out.print("Doctor asignado (ID numérico): ");
		String doctorId = sc.nextLine();
		sc.nextLine();

		User doctor = new User();
		doctor.setIdCard(doctorId);
		doctor.setRole(Role.MEDIC);
		appointment.setDoctor(doctor);

		System.out.print("Fecha y hora (YYYY-MM-DDTHH:MM): ");
		String dateTime = sc.nextLine();
		appointment.setDate(LocalDateTime.parse(dateTime));

		System.out.print("Motivo de la cita: ");
		appointment.setReason(sc.nextLine());

		appointment.setStatus(Status.PENDING);

		User admin = buildAdminUser();
		createAppointment.create(appointment, admin);

		System.out.println("✅ Cita creada con éxito.");
	}

	private void crearFactura() throws Exception {
		Invoice invoice = new Invoice();

		System.out.print("Nombre del paciente: ");
		invoice.setPatientName(sc.nextLine());

		System.out.print("Edad del paciente: ");
		invoice.setPatientAge(sc.nextInt());
		sc.nextLine();

		System.out.print("ID del paciente: ");
		invoice.setPatientIdCard(sc.nextLine());

		System.out.print("Nombre del doctor: ");
		invoice.setDoctorName(sc.nextLine());

		System.out.print("Nombre del seguro: ");
		invoice.setInsuranceName(sc.nextLine());

		System.out.print("Número de póliza: ");
		invoice.setPolicyNumber(sc.nextLine());

		invoice.setDate(LocalDate.now());

		System.out.print("Monto total: ");
		invoice.setTotalAmount(sc.nextDouble());
		sc.nextLine();

		User admin = buildAdminUser();
		createInvoice.create(invoice, admin);

		System.out.println("✅ Factura creada con éxito.");
	}

	private User buildAdminUser() {
		User admin = new User();
		admin.setRole(Role.ADMINISTRATIVESTAFF);
		return admin;
	}
}
