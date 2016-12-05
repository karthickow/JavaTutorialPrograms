package com.java.tutorial.unicodedemo;

public class UnicodeFormatterDemo {

	static public String byteToHex(byte b) {
	      // Returns hex String representation of byte b
	      char hexDigit[] = {
	         '0', '1', '2', '3', '4', '5', '6', '7',
	         '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'
	      };
	      char[] array = { hexDigit[(b >> 4) & 0x0f], hexDigit[b & 0x0f] };
	      return new String(array);
	   }

	   static public String charToHex(char c) {
	      // Returns hex String representation of char c
	      byte hi = (byte) (c >>> 8);
	      byte lo = (byte) (c & 0xff);
	      return byteToHex(hi) + byteToHex(lo);
	   }
	
	public static void main(String[] args) {
		char [] c = new char[] {'H', 'e', 'l', 'l', 'o'};
		
		for(int i=0; i < c.length; i++){
			System.out.println(charToHex(c[i]));
			System.out.println(Character.getType(c[i]));
			System.out.println(Character.getType(c[i]) == Character.LOWERCASE_LETTER);
		}
	}

}

