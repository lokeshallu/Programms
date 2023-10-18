package programms;

import java.util.Scanner;

public class Rainbowcolour {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter charcter value");
		char c = scan.next().charAt(0);
		switch (c){
		case 'v':
			System.out.println("rainbow colour is voilet");
		    break;
		case 'i':
			System.out.println("rainbow colour is indigo");
			break;  
		case 'b':
			System.out.println("rainbow colour is blue");
			break;
		case 'r':
			System.out.println("red is a rainbow colour");
			break;
		case 'y':
			System.out.println("yellwo is a rainbow colour");
			break;
			
		case 'g':
			System.out.println(" green is a rainbow colour");
			break;
			default :
			{
				System.out.println(" "+c+" not a rainbow colour");
			}
	}
	}

}
