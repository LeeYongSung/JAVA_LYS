package _1100;

import java.util.Scanner;

public class _1157 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		
		if(a >= 50 && a <= 60) {
			System.out.println("win");
		} else {
			System.out.println("lose");
		}
		
		sc.close();
	}
}
