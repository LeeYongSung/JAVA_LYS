package _1200;

import java.util.Scanner;

public class _1290 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int cnt = 0;
		
		for (int i = 1; i < a; i++) {
			if(a % i == 0) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}
}
