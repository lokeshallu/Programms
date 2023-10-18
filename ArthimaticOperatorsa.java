package programms;

import java.util.Scanner;

public class ArthimaticOperatorsa 
	{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int difference = substractionN(num1,num2);
		int product = multiplicationN(num1,num2);
		int quotient = division(num1,num2);
		double remainder = remainde(num1,num2);
		
		System.out.println("difference"+difference);
		System.out.println("product"+product);
		System.out.println("quotient"+quotient);
		System.out.println("remainder"+remainder);
		
	
			   
			    
   }

	private static int division(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1%num2;
	}

	private static double remainde(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1/(double)num2;
	}

	private static int substractionN(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1-num2;
	}

	private static int multiplicationN(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1*num2;
	}
			   
			} 

