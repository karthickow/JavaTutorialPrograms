package com.java.tutorial.threaddemo;

class Counter{
	
	int count;
	
	public synchronized void incrementCount(){
		count++;
	}
}

public class SynchronizationDemo {

	public static void main(String[] args) throws InterruptedException {
		Counter counter = new Counter();
		
		/*Thread t1 = new Thread(() -> {
			for(int i=0; i<1000; i++){
				counter.incrementCount();
				}
		}, "Thread 1");*/
		
		Thread t1 = new Thread(new Runnable(){
			@Override
			public void run(){
				for(int i=0; i<10000; i++){
					counter.incrementCount();
				}
			}
		}, "Thread 1");
		
		Thread t2 = new Thread(() -> {
			for(int i=0; i<10000; i++){
				counter.incrementCount();
				}
		}, "Thread 2");
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(counter.count);
	}

}
