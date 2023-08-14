package _1100;

import java.util.Scanner;

public class _1152 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		if(N < 10) {
			System.out.println("small");
		} else {
			System.out.println("big");
		}
		
		sc.close();
	}
}
