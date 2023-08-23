package _1200;

import java.util.Scanner;

public class _1261 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int b = 0;
		
		for (int i = 0; i < 10; i++) {
			int a = sc.nextInt();
			
			if(a%5 == 0) {
				b = a;
				break;
			}
		}
		System.out.println(b);
		sc.close();
	}
}
