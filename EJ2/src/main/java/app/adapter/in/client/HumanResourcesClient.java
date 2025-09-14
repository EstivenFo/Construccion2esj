package app.adapter.in.client;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import app.domain.model.User;
import app.domain.model.enums.Role;
import app.domain.services.CreateUser;
import app.domain.services.UpdateUser;

@Controller
public class HumanResourcesClient {
	@Autowired
	private  CreateUser createUser;
	@Autowired
	private  UpdateUser updateUser;

	
	public HumanResourcesClient(CreateUser createUser, UpdateUser updateUser) {
		this.createUser = createUser;
		this.updateUser = updateUser;
	}
	
	private static final String MENU = """
			=== Menú Recursos Humanos ===
			1. Crear empleado
			2. Actualizar empleado
			3. Buscar empleado
			0. Salir
			""";

	public void run() {
		Scanner sc = new Scanner(System.in);
		int opcion;
		do {
			System.out.println(MENU);
			opcion = sc.nextInt();
			sc.nextLine(); // limpiar buffer

			try {
				switch (opcion) {
				case 1 -> create(sc);
				case 2 -> update(sc);
				case 3 -> search(sc);
				case 0 -> System.out.println("Saliendo...");
				default -> System.out.println("Opción inválida.");
				}
			} catch (Exception e) {
				System.out.println("Error: " + e.getMessage());
			}

		} while (opcion != 0);

		sc.close();
	}

	private void create(Scanner sc) throws Exception {
		User user = new User();
		System.out.print("Nombre completo: ");
		user.setFullName(sc.nextLine());

		System.out.print("Cédula: ");
		user.setIdCard(sc.nextLine());
		sc.nextLine();

		System.out.print("Email: ");
		user.setEmail(sc.nextLine());

		System.out.print("Teléfono: ");
		user.setPhone(sc.nextLong());
		sc.nextLine();

		System.out.print("Dirección: ");
		user.setAddress(sc.nextLine());

		user.setRole(Role.HUMANRESOURCES); // el que crea debe ser RH

		createUser.createUser(user);
		System.out.println("Empleado creado con éxito.");
	}

	private void update(Scanner sc) throws Exception {
		User user = new User();

		System.out.print("Cédula del empleado a actualizar: ");
		user.setIdCard(sc.nextLine());
		sc.nextLine();

		System.out.print("Nuevo nombre completo: ");
		user.setFullName(sc.nextLine());

		System.out.print("Nuevo email: ");
		user.setEmail(sc.nextLine());

		System.out.print("Nuevo teléfono: ");
		user.setPhone(sc.nextLong());
		sc.nextLine();

		System.out.print("Nueva dirección: ");
		user.setAddress(sc.nextLine());

		user.setRole(Role.HUMANRESOURCES); // RH actualizando

		updateUser.update(user);
		System.out.println("Empleado actualizado con éxito.");
	}

	private void search(Scanner sc) throws Exception {
		System.out.print("Ingrese la cédula: ");
		String idCard = sc.nextLine();
		sc.nextLine();

		User user = createUser.searchById(idCard);
		System.out.println("Empleado encontrado: " + user);
	}
}
