package _1400;

import java.util.Scanner;

public class _1472 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int[][] c = new int[a][b];
		int d = a*b;//제일 큰값에서 증가해서 시작
		
		if(a%2==0) {
			for (int i = 0; i < a; i++) {
				if(i%2==0)
				for (int j = b-1; j >= 0; j--) {
					c[i][j]=d;
					d--;
				}
				else if(i%2 !=0)
				for (int j = 0; j < b; j++) {
					c[i][j]=d;
					d--;					
				}
			}
		}else if(a % 2 != 0){
			for (int i = 0; i < a; i++) {
				if(i%2 ==0)
				for (int j = 0; j < b; j++) {
					c[i][j]=d;
					d--;
				}
				else if(i%2 !=0)
				for (int j = b-1; j >= 0; j--) {
					c[i][j]=d;
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
