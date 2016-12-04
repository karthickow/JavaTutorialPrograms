package com.java.tutorial.objectcopy;

/*
	 1. Shallow copy
	 2. Deep copy
	 3. Clone
 */

class A implements Cloneable {
	int i, j;

	@Override
	public String toString() {
		return "A [i=" + i + ", j=" + j + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

public class ObjecyCopyDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		A obj1 = new A();
		obj1.i = 5;
		obj1.j = 6;
		
		//Shallow copy
		A obj2 = obj1;
		obj1.j = 8;
		
		System.out.println(obj1); // 5, 8
		System.out.println(obj2); // 5, 6
		System.out.println(obj2 instanceof A);
		
		//Deep copy
		A obj3 = new A();
		obj3.i = obj1.i;
		obj3.j = obj1.j;
		
		obj1.j = 7;
		
		System.out.println(obj1); // 5, 7
		System.out.println(obj3); // 5, 8
		System.out.println(obj3 instanceof A);
		
		// Clone
		obj1.j = 9;
		A obj4 = (A) obj1.clone();
		
		System.out.println(obj4 == obj1);
		System.out.println(obj4.equals(obj1));
		System.out.println(obj1 instanceof A);
		System.out.println(obj4 instanceof A);
		
		System.out.println(obj1);
		System.out.println(obj4);
	}

}
