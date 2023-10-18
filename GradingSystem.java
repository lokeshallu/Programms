package programms;

import java.util.Scanner;

public class GradingSystem {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter");
		int M = scan.nextInt();
		
		char result = 0;
		if(M>=90) {
			result='a';
			
		}
		if(M<80) {
			result='b';
		}
		
		switch (result) {
		
		case 'a':
			System.out.print("A Grade");
			break;
		case 'b':
			System.out.println("B Grade");
			
		break;
		default:
		System.out.println("try again!!!!!!!.........!!!!!");
		}
		
	}

}
