package _1000;

import java.util.Scanner;

public class _1078 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = 0;
		
		for (int i = 0; i <= a; i++) {
			if(i%2 == 0) b += i;
		}
		System.out.println(b);
		
		sc.close();
		
	}
}
