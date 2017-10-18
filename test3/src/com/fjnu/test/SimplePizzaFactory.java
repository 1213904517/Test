package com.fjnu.test;

public class SimplePizzaFactory {
	
	public Pizza createPizza(String type){
		
		if(type.equals("Cheese")){
			return new CheesePizza();
		}
		
		if(type.equals("Pepperoni")){
			return new PepperoniPizza();
		}
		
		if(type.equals("Clam")){
			return new ClamPizza();
		}
		
		return null;
	}

}
