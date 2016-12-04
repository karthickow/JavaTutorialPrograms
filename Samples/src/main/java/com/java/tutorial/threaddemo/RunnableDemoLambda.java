package com.java.tutorial.threaddemo;

public class RunnableDemoLambda {

	public static void main(String[] args) throws IllegalArgumentException, InterruptedException {
		
		Thread t1 = new Thread(() -> {
			for(int i=0; i<=5; i++){
				System.out.println("Hi");
				try {
					Thread.sleep(1000);
				}catch(IllegalArgumentException e){
					e.printStackTrace();
				}
				catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		Thread t2 = new Thread(() -> {
			for(int i=0; i<=5; i++){
				System.out.println("Hello");
				try {
					Thread.sleep(1000);
				}catch(IllegalArgumentException e){
					e.printStackTrace();
				}
				catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		t1.start();
		Thread.sleep(10);
		t2.start();
	}

}
