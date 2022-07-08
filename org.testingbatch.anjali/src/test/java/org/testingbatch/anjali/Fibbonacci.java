package org.testingbatch.anjali;

public class Fibbonacci {
	public static void main(String [] args) {
		int num = 10;
		int a = 0, b = 1, c=0;
		System.out.println(a);
		System.out.println(b);
		for (int i=0; i<num; i++) {
			c = b;
			b = a + b;
			a = c;
			System.out.println(b);
			
		}
		int ten = getNumber(40);
		System.out.println(ten);
	}
	
	public static int getNumber(int a) throws NumberFormatException
	{
		if(a < 50) {
			throw new NumberFormatException();
		}
		return a*10;
	}
}
