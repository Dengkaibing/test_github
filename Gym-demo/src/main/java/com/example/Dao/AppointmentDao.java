package com.example.Dao;

import com.example.entity.Appointment;
import com.example.entity.AppointmentExample;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface AppointmentDao {
    public List<Appointment> SelectAllAppointment();
    public boolean DeleteAppointment(int AppointmentId);
    public boolean UpdateAppointment(Appointment appointment);
    public boolean InsertAppointment(Appointment appointment);
    public List<Appointment> SelecAppointment(AppointmentExample appointmentExample);
    public Appointment SelectBykey(int ApponintmentId);
}
