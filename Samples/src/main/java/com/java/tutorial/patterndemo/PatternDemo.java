package com.java.tutorial.patterndemo;

public class PatternDemo {

	public static void main(String[] args) {
		/* Pattern
		 *  1 
			0 1 
			1 0 1 
			0 1 0 1 
			1 0 1 0 1 
		 *  
		 */
		
		for(int i = 0; i < 5; i++){			
			for(int j = 0; j <= i; j++){
				if((i + j) %2 == 0)
					System.out.print("1 ");
				else
					System.out.print("0 ");
			}
			System.out.println();
		}
		
		/* Pattern
		 *  1 
			2 2 
			3 3 3 
			4 4 4 4 
			5 5 5 5 5 
		 *  
		 */
		System.out.println();
		
		for(int i = 1; i <= 5; i++){			
			for(int j = 1; j <= i; j++){
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}
