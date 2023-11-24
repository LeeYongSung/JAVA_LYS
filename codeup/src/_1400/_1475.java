package _1400;

import java.util.Scanner;

public class _1475 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int[][] c = new int[a][b];
		int d = a*b;
		if(b%2!=0) {
			for (int i = 0; i < b; i++) {
				if(i%2 == 0)//짝수
				for (int j = a-1; j >= 0; j--) {
					c[j][i]=d;
					d--;
				}
				else if (i%2 != 0)//홀수
					for (int j = 0; j < a; j++) {
						c[j][i]=d;
						d--;
					}
			}
		}else if(b % 2 == 0){
			for (int i = 0; i < b; i++) {
				if(i%2 !=0)//홀수
					for (int j = a-1; j >= 0; j--) {
						c[j][i]=d;
						d--;
					}
				else if (i%2 == 0)//짝수
					for (int j = 0; j < a; j++) {
						c[j][i]=d;
						d--;
					}
			}
		}
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
