package _1500;

import java.util.Scanner;

public class _1509 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[11][10];
    //플레이어까지 다 받기 위해
		for (int i = 0; i < 11; i++) {
			for (int j = 0; j < 10; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		for(int i = 0; i < 10; i++) {
			for(int j = 9; j >= 0; j--) {
        //10번째 줄이 1인 경우
				if(arr[10][i] == 1) {
          //만약 0보다 크면 crash 바로 종료
					if(arr[j][i] > 0) {
						System.out.println((i+1) + " crash");
						break;
            //0보다 작다면 fall 바로 종료
					} else if(arr[j][i] < 0) {
						System.out.println((i+1) + " fall");
						break;
					} else if(arr[j][i] == 0) {
            //j가 0까지 무사히 다다르고 0일 경우 safe
						if(j == 0) {
							System.out.println((i+1) + " safe");
						}
					}
				}
			}
		}
	}
}
