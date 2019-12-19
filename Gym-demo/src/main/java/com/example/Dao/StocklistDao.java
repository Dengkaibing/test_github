package com.example.Dao;

import com.example.entity.Stocklist;
import com.example.entity.StocklistExample;

import java.util.List;

public interface StocklistDao {
    public List<Stocklist> SelectAllStocklist();
    public boolean DeleteStocklist(String StockId);
    public boolean InsertStockList(Stocklist stocklist);
    public boolean UpdateStockList(Stocklist stocklist);
    public List<Stocklist>  SelectStocklist(StocklistExample stocklistExample);
    public Stocklist SelectBykey(String StcokId);
}
