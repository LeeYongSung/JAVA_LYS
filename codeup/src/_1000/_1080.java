package _1000;

import java.util.Scanner;

public class _1080 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int sum = 0;
		
		for (int i = 0; i < a; i++) {
			if(sum < a) {
				sum += i;
			} else {
				System.out.println(i-1);
				break;
			}
		}
		
		
		sc.close();
		
	}
}
