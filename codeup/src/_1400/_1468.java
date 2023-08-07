package _1400;

import java.util.Scanner;

public class _1468 {

	public static void main(String[] args) {
		
//		 1. N을 입력 받는다
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
//		 2. NxN 구조로  배열을 생성한다
		int arr[][] = new int[N][N];
		int sw = 1;
		int k = 1;
//		 3. 1~N 행까지 반복한다 (i : 0 ~ N-1)증가
		 for (int i = 0; i < N; i++) {
			if(sw == 1) { // 정방향
				for (int j = 0; j < N; j+=sw) { // ++
					arr[i][j] = k++;
				}
//				sw = 0;
			} else { // 역방향
				for (int j = N-1; j >= 0; j+=sw) { // --
					arr[i][j] = k++;
				}
//				sw = 1;
			}
			sw = sw * (-1);
		}
		 
//		 4. 2차원 배열을 출력한다
		 for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		 sc.close();
//		Scanner sc = new Scanner(System.in);
//		int input = sc.nextInt();
//		
//		int arr[][] = new int[input][input];
//		int num = 1;
//		
//		for (int i = 0; i < arr.length; i++) {
//			if(i%2 == 0) {
//				for (int j = 0; j < arr[i].length; j++) {
//					arr[i][j] += num++;
////						System.out.print(arr[i][j] + " ");
//				}	
//			} else {
//				for (int j = input-1; j > -1; j--) {
//					arr[i][j] += num++;
//						
//				}
//			}
//		}
//		
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr.length; j++) {
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}
	}
}
