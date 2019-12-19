package com.example.Iml;

import com.example.Dao.AppointmentDao;
import com.example.entity.Appointment;
import com.example.entity.AppointmentExample;
import com.example.respository.AppointmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class AppointmentIml implements AppointmentDao {
    @Autowired
    private AppointmentMapper appointmentMapper;
    @Override
    public List<Appointment> SelectAllAppointment() {
           AppointmentExample appointmentExample=new AppointmentExample();
           List<Appointment> appointmentList=appointmentMapper.selectByExample(appointmentExample);
        return  appointmentList;
    }

    @Override
    public boolean DeleteAppointment(int AppointmentId) {
        int i=appointmentMapper.deleteByPrimaryKey(AppointmentId);
        return i!=0?true:false;
    }

    @Override
    public boolean UpdateAppointment(Appointment appointment) {
        int i=appointmentMapper.updateByPrimaryKeySelective(appointment);
        return i!=0?true:false;
    }

    @Override
    public boolean InsertAppointment(Appointment appointment) {
          int i=appointmentMapper.insertSelective(appointment);
        return i!=0?true:false;
    }

    @Override
    public List<Appointment> SelecAppointment(AppointmentExample appointmentExample) {
        List<Appointment> appointmentList=appointmentMapper.selectByExample(appointmentExample);
        return appointmentList;
    }

    @Override
    public Appointment SelectBykey(int ApponintmentId) {
        Appointment appointment=appointmentMapper.selectByPrimaryKey(ApponintmentId);
        return appointment;
    }
}
