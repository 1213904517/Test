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
			System.out.println("�������������");
			return;
		}
		System.out.println("���ţ���ɿ���");
		empty=false;
		boiled=false;
	}
	
	public void Boil(){
		if(boiled==true){
			System.out.println("ţ���ɿ����Ѿ����");
			return;
		}
		empty=false;
		boiled=true;
		System.out.println("���ţ���ɿ���");
	}
	
	public void Drain() {
		empty=false;
		boiled=true;
		System.out.println("�������ţ���ɿ���");
		
	}
	
	public boolean Isempty() {
		return empty;
	}
   
	public boolean Isboiled() {
		return boiled;
	}
	
	
}
