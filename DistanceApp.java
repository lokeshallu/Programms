package programms;

import java.util.Scanner;

public class DistanceApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Distance d1 = new Distance();
		d1. speed = scan.nextDouble();
		d1. time = scan.nextDouble();
		double totalDistance=d1.totalDistance(d1.speed,d1.time);
		System.out.print("totalDistance="+totalDistance);
		
	}



}
