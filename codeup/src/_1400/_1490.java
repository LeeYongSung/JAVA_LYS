package _1400;

import java.util.Scanner;

public class _1490 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int[][] c = new int[a][b];
		int i=a, j=0, n=0 ,t = -1,f=a,g=b;
		//달팽이
		while(true) {
			for (int l = 0; l < a; l++) {
				n++;
				i+=t;
				c[i][j] = n;
			}
			t*=-1; //방향 전환
			a--;
			b--;
			for (int l = 0; l < b; l++) {
				n++;
				j+=t; 
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
		sc.close();
	}
}
