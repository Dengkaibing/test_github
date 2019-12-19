package com.example.Dao;

import com.example.entity.Service;
import com.example.entity.ServiceExample;

import java.util.List;

public interface ServiceDao {
    public List<Service>  SelectAllService();
    public boolean InsertService(Service service);
    public boolean DeleteService(String ServiceId);
    public boolean UpdateService(Service service);
    public List<Service>  SelectService(ServiceExample serviceExample);
    public Service  SelectBykey(String ServiceId);
    public List<String>  SelectServiceType();
    public List<String>  SelectServiceName();
 }
