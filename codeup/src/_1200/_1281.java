package _1200;

import java.util.Scanner;

public class _1281 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = 0;		
		for (int i = a; i<=b; i++) {
			if (i%2 == 0) {
				c = c-i;
				System.out.print("-"+i);
			}else {
				c = c+i;
				if(i==a) {
					System.out.print(i);
				}
				else {
					System.out.print("+"+i);
				}
			}
		}
		System.out.print("="+c);
		sc.close();
	}
}
