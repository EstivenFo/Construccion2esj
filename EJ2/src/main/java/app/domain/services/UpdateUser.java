package app.domain.services;

import app.domain.model.enums.Role;
import app.domain.ports.UserPort;
import app.domain.model.User;

public class UpdateUser {

    private  UserPort userPort;
    // Método para actualizar un empleado
    public void update(User user) throws Exception {
        // Validar que el empleado exista
        User existingUser = userPort.searchById(user.getIdCard());
        if (existingUser == null) {
            throw new Exception("No se encontró un empleado con ID: " + user.getIdCard());
        }
        if (user.getRole() != Role.HUMANRESOURCES) {
            throw new SecurityException("Solo personal de Recursos Humanos puede Actualizar un empleado.");
        }
        // Validación de rol permitido
        Role role = user.getRole();
        if (!(role == Role.MEDIC || role == Role.NURSE
           || role == Role.ADMINISTRATIVESTAFF || role == Role.HUMANRESOURCES)) {
            throw new IllegalArgumentException("El rol asignado no corresponde a un empleado válido.");
        }
        // Actualizar empleado en el puerto
        userPort.update(user);
    }
}
