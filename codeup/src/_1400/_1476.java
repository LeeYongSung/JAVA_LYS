package _1400;

import java.util.Scanner;

public class _1476 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int[][] c = new int[a][b];
		int d=1;
		int sum = a+b;
		for (int k = 0; k < sum; k++) { //입력값 3 4 일경우 6회전
			for (int i = 0; i < b; i++) {//3번반복
				for (int j = 0; j < a; j++) {//2번반복
					if(i+j == k) c[j][i]=d++;//k값 0,1,2,3,4,5 i+j값 더했을때 k값이랑 같을때가 [j][i]값이 배열에 들어가는 인덱스번호
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
