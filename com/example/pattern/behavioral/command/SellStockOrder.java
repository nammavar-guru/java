package com.example.pattern.behavioral.command;

public class SellStockOrder implements Order {
	StockTrade stockTrade;
	
	public SellStockOrder(StockTrade stockTrade) {
		this.stockTrade=stockTrade;
	}
	public void execute() {
		stockTrade.sell();
	}
}
