package com.supermark.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.supermark.entity.Stock;

@Repository("stockDao")
public interface StockDao {

	public void insertStock(Stock stock);
	
	public void updateStock(Stock stock);
	
	public void deleteStock(Stock stock);
	
	public List<Stock> selectStocks();
	
	public Stock queryStockById(Integer id);
}
