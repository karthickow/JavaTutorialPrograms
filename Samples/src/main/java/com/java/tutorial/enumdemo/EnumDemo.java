package com.java.tutorial.enumdemo;

enum Mobile{
	
	APPLE(100), SAMSUNG, HTC(50);
	
	int price;
	
	public int getPrice() {
		return price;
	}

	private Mobile() {
		System.out.println("Default Constructor");
	}
	
	private Mobile(int price) {
		System.out.println("In Overloaded Constructor");
		this.price = price;
	}
}

public class EnumDemo {

	public static void main(String[] args) {
		for(Mobile mobile : Mobile.values()){
			System.out.println(mobile.ordinal()+ " "+ mobile + " = " +mobile.getPrice());			
		}
	}

}
