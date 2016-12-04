package com.java.tutorial.innerclassdemo;

// Member inner class 
// Static inner class 
// Anonymous inner class

class A {
	int i;
	
	// Member inner class
	class B {
		int j;
	}
	
	// Static inner class
	static class C {
		int k;
	}
}

class Phone {
	
	public void show() {
		System.out.println("Call");
	}
}

public class InnerClassDemo {

	public static void main(String[] args) {
		A objA = new A();
		
		// Member inner class
		A.B objB =  objA.new B();
		objB.j = 5;
		System.out.println(objB.j);
		
		// Static inner class
		A.C objC = new A.C();
		objC.k = 10;
		System.out.println(objC.k);
		
		// Anonymous inner class
		Phone phone = new Phone(){
			public void show() {
				System.out.println("call, sms");
			}
		};
		
		phone.show();
	}

}
