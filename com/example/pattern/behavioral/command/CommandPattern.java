package com.example.pattern.behavioral.command;

public class CommandPattern {

	public static void main(String[] args) {
		//We have created an interface Order which is acting as a command. 
		//We have created a Stock class which acts as a request. 
		//We have concrete command classes BuyStock and SellStock implementing Order interface which will do actual command processing. 
		//A class Broker is created which acts as an invoker object. It can take and place orders.
		StockTrade st = new StockTrade();
		BuyStockOrder bso = new BuyStockOrder(st);
		SellStockOrder sso = new SellStockOrder(st);
		
		//Agent object uses command pattern to identify which object will execute which
		//command based on the type of command. 
		Agent agent = new Agent();
		//A request is wrapped under an object as command and passed to invoker object.
		
		agent.placeOrder(bso);
		agent.placeOrder(sso);
	}

}
