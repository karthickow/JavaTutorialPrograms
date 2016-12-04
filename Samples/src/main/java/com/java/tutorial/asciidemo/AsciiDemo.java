package com.java.tutorial.asciidemo;

public class AsciiDemo {

	public static void main(String[] args) {
		for(int i = 0; i <= 255; i++){
			System.out.printf("%d : %c \n", i, i);
			System.out.println((char)i);
		}
	}
}
