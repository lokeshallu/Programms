package programms;
import java.util.Scanner;

public class AverageeApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Averagee a1 = new Averagee();
		a1.num1 = scan.nextInt();
		a1.num2 = scan.nextInt();	
		a1.num3 = scan.nextInt();	
		a1.num4 = scan.nextInt();	
		a1.num5 = scan.nextInt();	
		a1.num6 = scan.nextInt();	
		a1.num7 = scan.nextInt();
		a1.num8 = scan.nextInt();	
		int Avg =  a1.Avg(a1.num1,a1.num2,a1.num3,a1.num4,a1.num5,a1.num6,a1.num7,a1.num8);{
		System.out.println(Avg);
		}

	}
	}
