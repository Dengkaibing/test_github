package com.example.Dao;

import com.example.entity.Warehouse;
import com.example.entity.WarehouseExample;

import java.util.List;

public interface WarehouseDao {
    public List<Warehouse> SelectAllWarehouse();
    public boolean DeleteWarehouse(int producrId);
    public boolean UpdateWarehouse(Warehouse warehouse);
    public boolean InsertWarehouse(Warehouse warehouse);
    public List<Warehouse> SelectWarehouse(WarehouseExample warehouseExample);
    public Warehouse SelectBykey(int productId);
}
