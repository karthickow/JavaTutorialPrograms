package com.java.tutorial.lambdaexpdemo;

interface Phone {
	
	public void show();
}

public class LambdaExpDemo {

	public static void main(String[] args) {
		Phone phone = () -> System.out.println("call, sms");
	}

}
