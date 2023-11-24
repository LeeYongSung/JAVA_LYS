package _1500;

import java.util.Scanner;

public class _1510 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[][] b = new int[a][a];
		int i=0,j=a/2,v = 1; //넣을값
		
		while(true) {
			if(i < 0 )i= a-1; // 행이 첫행보다 작아지는 경우 마지막으로 넘어간다.
			if(j == a)j = 0; //열이 마지막열보다 커지는 경우 첫 열로 넘어간다.
			if(b[i][j] == 0) { 
				b[i][j] = v;
			}
			if(v % a == 0) {//넣은 수가 배수이면 행만 증가
				i++;
			}else {
				i--;//2 1 1 2 
				j++;//2 0 0 0
			}
				v++;
			if(v == a*a+1) break;//종료조건
		}
		
		for (int k = 0; k < a; k++) {
			for (int k2 = 0; k2 < a; k2++) {
				System.out.print(b[k][k2] +" ");
			}
			System.out.println();
		}
	}
}
