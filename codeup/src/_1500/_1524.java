package _1500;

import java.util.Scanner;

public class _1524 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[11][11];
		//맨왼쪽 맨위 맨오른쪽 맨아래쪽까지 검사해야하므로.
		for(int i = 1; i <= 9; i++) {
			for(int j= 1; j <= 9; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int r = sc.nextInt();
		int c = sc.nextInt();
		//주위 8곳 검사
		int num =  arr[r-1][c] + arr[r-1][c+1] + arr[r][c+1] + arr[r+1][c+1] + arr[r+1][c] + arr[r+1][c-1] + arr[r][c-1] + arr[r-1][c-1];
		//1이라면 -1출력
		if(arr[r][c] == 1) {
			System.out.println(-1);
		} else {
			//아니면 num을 그대로 출력
			System.out.println(num);
		}	
	}
}
