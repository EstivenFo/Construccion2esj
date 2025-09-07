package app.domain.services;

import app.domain.model.User;
import app.domain.model.enums.Role;
import app.domain.ports.UserPort;

public class CreateUser {

    private  UserPort userPort;

    // Crear empleado con validación de rol
    public void createUser( User user) throws Exception {
        Role role = user.getRole();
        if (user.getRole() != Role.HUMANRESOURCES) {
            throw new SecurityException("Solo personal de Recursos Humanos puede crear un empleado.");
        }

        // Validación de roles permitidos
        if (!(role == Role.MEDIC || role == Role.NURSE
           || role == Role.ADMINISTRATIVESTAFF || role == Role.HUMANRESOURCES)) {
            throw new IllegalArgumentException("El rol asignado no corresponde a un empleado válido.");
        }

        // Guardar empleado si es válido
        userPort.save(user);
    }


    // Buscar empleado por ID
    public User searchById(long idCard) throws Exception {
        User user = userPort.searchById(idCard);
        if (user == null) {
            throw new Exception("Empleado con ID " + idCard + " no encontrado.");
        }
        return user;
    }
}
