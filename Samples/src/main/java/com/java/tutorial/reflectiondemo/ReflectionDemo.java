package com.java.tutorial.reflectiondemo;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class A extends B{
	
}

class B {
	
}

public class ReflectionDemo {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, 
			NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		Class<?> c = Class.forName("com.java.tutorial.reflectiondemo.Test");
		
		Test test = (Test) c.newInstance();
		test.show();
		
		Method m = c.getDeclaredMethod("privateShow", null);
		m.setAccessible(true);
		m.invoke(test, null);
		
		Class<?> class1 = Class.forName("com.java.tutorial.reflectiondemo.A");
		System.out.println(class1.isInterface());
		System.out.println(class1.getSuperclass());
	}
}
