package app.domain.ports;

import java.util.List;
import app.domain.model.Appointment;
import app.domain.model.User;

public interface AppointmentPort {

    // Guardar una nueva cita
   public void save(Appointment appointment) throws Exception;

    // Buscar todas las citas de un paciente
   public List<Appointment> searchByPatientId(Long patientId) throws Exception;

    // Buscar todas las citas de un doctor
   public List<Appointment> searchByDoctorId(User doctorId) throws Exception;

    // Actualizar cita
   public void update(Appointment appointment) throws Exception;

    // Listar todas las citas
   public List<Appointment> findAll() throws Exception;
}

