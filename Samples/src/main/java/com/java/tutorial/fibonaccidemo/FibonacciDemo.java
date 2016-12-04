package com.java.tutorial.fibonaccidemo;

import java.util.Scanner;

public class FibonacciDemo {
	
	public static void main(String[] args) {
		
		Scanner scan = null, scan1 = null;
		int k = 0, a = 1, b = 1, num = 0;
		char wantToContinue = 'Y';
		
		while(wantToContinue == 'Y' || wantToContinue == 'y') {
		
			System.out.print("Enter the number : ");
			scan = new Scanner(System.in);
			num = scan.nextInt();
			
			System.out.print(a + " " + b + " ");
			
			for(int i = 1; i <= num; i++) {
				k = a + b;
				System.out.print(k + " ");
				a=b;
				b=k;
			}
			
			k = 0; 
			a = 1;
			b = 1;
			
			System.out.print("\nWould you like to continue? (Y/N) : ");
			scan1 = new Scanner(System.in);			
			wantToContinue = scan1.next().charAt(0);
		}
		
		System.out.print("\nThank you!");
		scan.close();
		scan1.close();
	}
}
