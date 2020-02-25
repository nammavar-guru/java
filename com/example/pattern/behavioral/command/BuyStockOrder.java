package com.example.pattern.behavioral.command;


public class BuyStockOrder implements Order {
	StockTrade stockTrade;
	
	public BuyStockOrder(StockTrade stockTrade) {
		this.stockTrade=stockTrade;
	}
	public void execute() {
		stockTrade.buy();
	}
}
