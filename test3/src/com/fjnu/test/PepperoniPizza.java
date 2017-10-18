package com.fjnu.test;

public class PepperoniPizza extends Pizza {
	public void print()
	{
		System.out.println("这是PepperoniPizza");
	}
	public void prepare(){
	System.out.println("准备");
}

public void bake(){
	 System.out.println("烘焙");
}

public void cut(){
	 System.out.println("切割");
}

public void box(){
	 System.out.println("包装");
}
}
