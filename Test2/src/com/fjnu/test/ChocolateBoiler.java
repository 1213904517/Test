package com.fjnu.test;

public class ChocolateBoiler{
   
	private boolean empty;
	private boolean boiled;
	
	
	public  ChocolateBoiler(){
		empty=false;
		boiled=true;
	}
	
	
	public void Fill(){
		if(empty==true){
			System.out.println("已满不用再添加");
			return;
		}
		System.out.println("填充牛奶巧克力");
		empty=false;
		boiled=false;
	}
	
	public void Boil(){
		if(boiled==true){
			System.out.println("牛奶巧克力已经煮沸");
			return;
		}
		empty=false;
		boiled=true;
		System.out.println("煮沸牛奶巧克力");
	}
	
	public void Drain() {
		empty=false;
		boiled=true;
		System.out.println("倒出煮沸牛奶巧克力");
		
	}
	
	public boolean Isempty() {
		return empty;
	}
   
	public boolean Isboiled() {
		return boiled;
	}
	
	
}
