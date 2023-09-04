package _1300;

import java.util.Scanner;

public class _1366 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.print("*");//첫째줄 별
		}
		System.out.println();
		for (int i = 1; i < n-1; i++) {//7회반복
			for (int j = 0; j < n; j++) {//가로 9번반복  0,1,2,3,4,5,6,7,8 
		//j==0 왼쪽테두리 별) j==i 왼쪽시작 대각선별) j==n-1-i 오른쪽시작 대각선별) j==n-1 오른쪽테두리별
				if(j==0 || j==i || j==n-1-i || j==n-1||n/2 == i||n/2 == j) {
					System.out.print("*");
				}
				else System.out.print(" ");
			}
			System.out.println();
		}
		for (int i = 0; i < n; i++) { //마지막줄 별
			System.out.print("*");
		}
	}
}
