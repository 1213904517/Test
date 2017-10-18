package com.fjnu.test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		PizzaStore b=new PizzaStore();
		b.orderPizza(a);

	}

}
