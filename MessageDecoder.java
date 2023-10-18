package programms;

import java.util.Scanner;

public class MessageDecoder {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char c = scan.next().charAt(0);
		int unicode =  messagedecoder(c);
		System.out.println(unicode);
		}

	private static int messagedecoder(char c) {
		// TODO Auto-generated method stub
		return c;
	}

}
