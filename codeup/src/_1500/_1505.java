package _1500;

import java.util.Scanner;

public class _1505 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[][] b = new int[a][a];
		int i=0, j=-1,n=0,t=1,g=a;
		
		while(true) {
			for(int o = 0; o < a; o++ ) {
				n++;
				j+=t;
				b[i][j] = n;
			}
			a--;
			for (int p = 0; p < a; p++) {
				n++;
				i+=t;
				b[i][j] = n;
			}
			t*=-1;//방향 전환
			if(a<=0)break;
		}
		
		for (int l = 0; l < g; l++) {
			for (int k = 0; k < g; k++) {
				System.out.print(b[l][k]+" ");
			}
			System.out.println();
		}
	}
}
