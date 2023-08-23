package _1200;

import java.util.Scanner;

public class _1216 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if( a == b-c) {
			System.out.println("does not matter");
		} else if (a < b-c) {
			System.out.println("advertise");
		} else {
			System.out.println("do not advertise");			
		}
		sc.close();
	}
	
}
