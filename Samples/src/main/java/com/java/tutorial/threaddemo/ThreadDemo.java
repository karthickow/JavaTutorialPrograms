package com.java.tutorial.threaddemo;

class Hi extends Thread{
	@Override
	public void run(){
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
	}
}

class Hello extends Thread{
	@Override
	public void run(){
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
	}
}

public class ThreadDemo {

	public static void main(String[] args) throws IllegalArgumentException, InterruptedException {
		Hi thread1 = new Hi();
		Hello thread2 = new Hello();
		
		thread1.start();
		Thread.sleep(10);
		thread2.start();
		
	}

}
