package _1200;

import java.util.Scanner;

public class _1282 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextInt();
		long k = 0;
		
		for ( long t = n ; t > 0; t--) {
			if (t*t < n) {
				k = n-(t*t);
				System.out.println(k+" "+t);
				break;
			}
		}
		sc.close();
	}
}
