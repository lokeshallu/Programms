package programms;





import java.util.Scanner;

public class ArthimaticOperator {
	public static void main(String[] args) {
		System.out.println("enter two numbers");
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();	
		
		int difference = substractNumber(num1,num2);
		int product   = multiplyNumbers(num1,num2);
		double quotient = divisionNumbers(num1,num2);
		int remainder = findRemainder(num1,num2);
		
		System.out.println("Difference="+difference);
		System.out.println("Product="+product);
		System.out.println("Quotient="+quotient);
		System.out.println("Remainder="+remainder);
		}

	private static int findRemainder(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1%num2;
	}

	private static double divisionNumbers(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1/(double)num2;
	}

	private static int multiplyNumbers(int num1, int num2) {
		// TODO Auto-generated method stub
		return  num1*num2;
	}

	private static int substractNumber(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1-num2;
		
	}

}   