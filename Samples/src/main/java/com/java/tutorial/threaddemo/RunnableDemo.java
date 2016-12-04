package com.java.tutorial.threaddemo;

class Hi1 implements Runnable{
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

class Hello1 implements Runnable{
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

public class RunnableDemo {

	public static void main(String[] args) throws IllegalArgumentException, InterruptedException {
		Thread thread1 = new Thread(new Hi1());
		Thread thread2 = new Thread(new Hello1());
		
		thread1.start();
		Thread.sleep(10);
		thread2.start();
	}

}
