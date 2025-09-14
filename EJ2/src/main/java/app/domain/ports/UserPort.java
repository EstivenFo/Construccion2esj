package app.domain.ports;


import app.domain.model.User;
import java.util.List;

public interface UserPort {

    // Guardar un empleado
    public void save(User user) throws Exception;

    // Buscar empleado por número de identificación
    public User searchById(String idCard) throws Exception;

    // Listar todos los empleados
    public List<User> findAll() throws Exception;

    // Actualizar empleado
    public void update(User user) throws Exception;

    // Eliminar empleado por ID
    public void delete(long idCard) throws Exception;
    
}
