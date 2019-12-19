package com.example.Iml;

import com.example.Dao.StocklistDao;
import com.example.entity.Stocklist;
import com.example.entity.StocklistExample;
import com.example.respository.StocklistMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StocklistIml implements StocklistDao {
    @Autowired
    private StocklistMapper stocklistMapper;
    @Override
    public List<Stocklist> SelectAllStocklist() {
        StocklistExample stocklistExample=new StocklistExample();
        List<Stocklist> stocklistList=stocklistMapper.selectByExample(stocklistExample);
        return stocklistList;
    }

    @Override
    public boolean DeleteStocklist(String StockId) {
        int i=stocklistMapper.deleteByPrimaryKey(StockId);
        return i!=0?true:false;
    }

    @Override
    public boolean InsertStockList(Stocklist stocklist) {
        int i=stocklistMapper.insertSelective(stocklist);
        return i!=0?true:false;

    }

    @Override
    public boolean UpdateStockList(Stocklist stocklist) {
        int i=stocklistMapper.updateByPrimaryKeySelective(stocklist);
        return i!=0?true:false;

    }

    @Override
    public List<Stocklist> SelectStocklist(StocklistExample stocklistExample) {
        List<Stocklist> stocklistList=stocklistMapper.selectByExample(stocklistExample);
        return stocklistList;
    }

    @Override
    public Stocklist SelectBykey(String  StcokId) {
        Stocklist stocklist=stocklistMapper.selectByPrimaryKey(StcokId);
        return stocklist;
    }
}
