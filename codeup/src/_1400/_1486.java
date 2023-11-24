package _1400;

import java.util.Scanner;

public class _1486 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int[][] c = new int[a][b];
		int i=-1, j=b-1, n=0 ,t = 1,f=a,g=b;
		//달팽이
		while(true) {
			for (int l = 0; l < a; l++) {//i는 ++ j는 b-1고정
				n++;
				i+=t;
				c[i][j] = n;
			}
			a--;
			b--;
			t*=-1; //방향 전환
			for (int l = 0; l < b; l++) {
				n++;
				j+=t; //3 3 3 2 1 0
				c[i][j] = n;
			}
			if(a<=0||b<=0) break; //while 탈출조건
		}
			
		for (int l = 0; l < f; l++) { //출력
			for (int l2 = 0; l2 < g; l2++) {
				System.out.print(c[l][l2] +" ");
			}
			System.out.println();
		}
	}
}
