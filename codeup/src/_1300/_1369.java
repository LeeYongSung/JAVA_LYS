package _1300;

import java.util.Scanner;

public class _1369 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if(i==1||i==n||j==1||j==n) {
					System.out.print("*");
				}else if(k == 1) {
					System.out.print("*");
				}else if((i+j) % k == 1) {//k =3일때 3의배수 나머지 1나올때 1+3 % 3 ==1 나머지가 1이될때 별찍기
					System.out.print("*");
				}else System.out.print(" ");
			}
			System.out.println();
		}
		
		
		
	}
}
