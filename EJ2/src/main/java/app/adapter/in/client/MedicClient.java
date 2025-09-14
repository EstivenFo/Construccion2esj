package app.adapter.in.client;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import app.domain.model.Order;
import app.domain.model.Record;
import app.domain.model.Patient;
import app.domain.model.User;
import app.domain.model.MedicalRecord;
import app.domain.services.CreateOrder;
import app.domain.services.CreateRecord;
import app.domain.services.UpdateRecord;
import app.domain.services.SearchMedicalRecordByPatient;

@Controller
public class MedicClient {

	@Autowired
	private CreateOrder createOrder;

	@Autowired
	private CreateRecord createRecord;

	@Autowired
	private UpdateRecord updateRecord;

	@Autowired
	private SearchMedicalRecordByPatient searchMedicalRecordByPatient;

	private final Scanner reader = new Scanner(System.in);
	private User currentDoctor;

	// Simulamos autenticación del médico
	public void login(User doctor) {
		this.currentDoctor = doctor;
	}

	// Crear una orden médica
	public void createOrderForPatient() {
		try {
			System.out.println("Ingrese el ID del paciente:");
			String patientId = reader.nextLine();

			System.out.println("¿Requiere hospitalización? (true/false):");
			boolean requiresHospitalization = Boolean.parseBoolean(reader.nextLine());

			Order order = new Order();

			createOrder.create(patientId, String.valueOf(currentDoctor.getIdCard()), requiresHospitalization,
					currentDoctor, order);

			System.out.println("✅ Orden médica creada exitosamente.");
		} catch (Exception e) {
			System.out.println("❌ Error al crear orden médica: " + e.getMessage());
		}
	}

	// Crear un registro clínico
	public void createRecordForPatient() {
		try {
			System.out.println("Ingrese el ID del paciente:");
			String patientId = reader.nextLine();

			Record record = new Record();
			record.setDoctorId(currentDoctor.getIdCard());

			System.out.println("Ingrese diagnóstico:");
			record.setDiagnosis(reader.nextLine());

			System.out.println("Ingrese tratamiento:");
			record.setTreatment(reader.nextLine());

			// ⚠️ CreateRecord espera (String, Record, User)
			createRecord.create(patientId, record, currentDoctor);

			System.out.println("✅ Registro clínico creado exitosamente.");
		} catch (Exception e) {
			System.out.println("❌ Error al crear registro clínico: " + e.getMessage());
		}
	}

	// Actualizar un registro clínico
	public void updateRecordForPatient() {
		try {
			System.out.println("Ingrese el ID del paciente:");
			String patientId = reader.nextLine();

			Record record = new Record();
			record.setDoctorId(currentDoctor.getIdCard());

			System.out.println("Ingrese nuevo diagnóstico:");
			record.setDiagnosis(reader.nextLine());

			System.out.println("Ingrese nuevo tratamiento:");
			record.setTreatment(reader.nextLine());

			// ⚠️ UpdateRecord espera (String, Record, User)
			updateRecord.updateRecord(patientId, record, currentDoctor);

			System.out.println("✅ Registro clínico actualizado exitosamente.");
		} catch (Exception e) {
			System.out.println("❌ Error al actualizar registro clínico: " + e.getMessage());
		}
	}

	// Buscar historia clínica (órdenes, registros, etc.) por paciente
	public void searchMedicalHistoryByPatient() {
		try {
			System.out.println("Ingrese el ID del paciente:");
			String patientId = reader.nextLine();

			Patient patient = new Patient();
			patient.setPatientId(Long.parseLong(patientId));

			// ⚠️ SearchMedicalRecordByPatient espera (Patient, User)
			List<MedicalRecord> records = searchMedicalRecordByPatient.search(patient, currentDoctor);

			System.out.println("📋 Historia clínica del paciente:");
			for (MedicalRecord rec : records) {
				System.out.println("- Fecha: " + rec.getDate());
				System.out.println("  Diagnóstico: " + rec.getDiagnosis());
				System.out.println("  Tratamiento: " + rec.getTreatment());
				System.out.println("-----------------------------------");
			}
		} catch (Exception e) {
			System.out.println("❌ Error al consultar historia clínica: " + e.getMessage());
		}
	}
}
