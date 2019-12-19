package com.example.Iml;


import com.example.Dao.ServiceDao;
import com.example.entity.Service;
import com.example.entity.ServiceExample;
import com.example.respository.ServiceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class ServiceIml implements ServiceDao {
    @Autowired
    private ServiceMapper serviceMapper;
    @Override
    public List<Service> SelectAllService() {
        ServiceExample serviceExample=new ServiceExample();
      List<Service> serviceList=serviceMapper.selectByExample(serviceExample);
        return serviceList;
    }

    @Override
    public boolean InsertService(Service service) {
          int i=serviceMapper.insertSelective(service);
          return i!=0?true:false;
    }

    @Override
    public boolean DeleteService(String ServiceId) {
        int i=serviceMapper.deleteByPrimaryKey(ServiceId);
        return i!=0?true:false;
    }
    @Override
    public boolean UpdateService(Service service) {
  int i=serviceMapper.updateByPrimaryKey(service);
        return i!=0?true:false;
    }

    @Override
    public List<Service> SelectService(ServiceExample serviceExample) {
        List<Service> serviceList=serviceMapper.selectByExample(serviceExample);
        return serviceList;
    }
    @Override
    public Service SelectBykey(String ServiceId) {
        Service service=serviceMapper.selectByPrimaryKey(ServiceId);
        return service;
    }

    @Override
    public List<String> SelectServiceType() {
        List<String> stringList=serviceMapper.SelectServiceType();
        return stringList;
    }
    @Override
    public List<String> SelectServiceName() {
        List<String> stringList=serviceMapper.SelectServiceName();
        return stringList;
    }
}
