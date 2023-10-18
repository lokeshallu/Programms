package programms;

import java.util.Scanner;

public class DoubleTrouble {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int d=doubles(a);
		System.out.println(d);
	}

	static int doubles(int a) {
		// TODO Auto-generated method stub
		return a*2;
	}

}
