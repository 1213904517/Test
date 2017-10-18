package com.fjnu.test;

public class PizzaStore {
    public void orderPizza(String type){
    	SimplePizzaFactory simplePizzaFactory=new SimplePizzaFactory();
    	Pizza a= simplePizzaFactory.createPizza(type);
    	if(a==null){
    		System.out.println("Pizza¿‡–Õ¥ÌŒÛ£°");
    	}
    	else{
    	a.prepare();
    	a.bake();
    	a.cut();
    	a.box();
    	a.print();
    	}
    }
}
