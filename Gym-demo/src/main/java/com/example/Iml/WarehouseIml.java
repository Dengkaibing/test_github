package com.example.Iml;

import com.example.Dao.WarehouseDao;
import com.example.entity.Warehouse;
import com.example.entity.WarehouseExample;
import com.example.respository.WarehouseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class WarehouseIml implements WarehouseDao {
    @Autowired
    private WarehouseMapper warehouseMapper;
    @Override
    public List<Warehouse> SelectAllWarehouse() {
        WarehouseExample warehouseExample=new WarehouseExample();
        List<Warehouse> warehouseList=warehouseMapper.selectByExample(warehouseExample);

        return warehouseList;
    }

    @Override
    public boolean DeleteWarehouse(int producrId) {
        int i=warehouseMapper.deleteByPrimaryKey(producrId);
        return i!=0?true:false;
    }

    @Override
    public boolean UpdateWarehouse(Warehouse warehouse) {
        int i=warehouseMapper.updateByPrimaryKeySelective(warehouse);
        return i!=0?true:false;
    }

    @Override
    public boolean InsertWarehouse(Warehouse warehouse) {
         int i=warehouseMapper.insertSelective(warehouse);
        return i!=0?true:false;
    }

    @Override
    public List<Warehouse> SelectWarehouse(WarehouseExample warehouseExample) {
        List<Warehouse>  warehouseList=warehouseMapper.selectByExample(warehouseExample);
        return warehouseList;
    }

    @Override
    public Warehouse SelectBykey(int productId) {
        Warehouse warehouse=warehouseMapper.selectByPrimaryKey(productId);
        return warehouse;
    }
}
