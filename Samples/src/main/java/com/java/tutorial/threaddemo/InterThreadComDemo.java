package com.java.tutorial.threaddemo;

class Quantity{
	
	int num;
	boolean valueSet;
	public synchronized void getNum() throws IllegalMonitorStateException, InterruptedException {
		while(!valueSet){
			wait();
		}		
		System.out.println("get : " + num);
		valueSet = false;
		notify();
	}

	public synchronized void setNum(int num) throws IllegalMonitorStateException, InterruptedException {
		while(valueSet){
			wait();
		}
		System.out.println("put : " + num);
		this.num = num;
		valueSet = true;
		notify();
	}
}

class Producer implements Runnable {

	Quantity quantity;
	
	public Producer(Quantity quantity) {
		this.quantity = quantity;
		new Thread(this, "Producer").start();
	}
	
	@Override
	public void run() {
		int i = 0;
		while(true){
			try {
				quantity.setNum(i++);
			} catch (IllegalMonitorStateException | InterruptedException e1) {
				e1.printStackTrace();
			}
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
	
class Consumer implements Runnable {

	Quantity quantity;
	
	public Consumer(Quantity quantity) {
		this.quantity = quantity;
		new Thread(this, "Consumer").start();
	}
	
	@Override
	public void run() {
		while(true){
			try {
				quantity.getNum();
			} catch (IllegalMonitorStateException | InterruptedException e1) {
				e1.printStackTrace();
			}
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
	
public class InterThreadComDemo {

	public static void main(String[] args) {
		Quantity quantity = new Quantity();
		new Producer(quantity);
		new Consumer(quantity);
	}

}
