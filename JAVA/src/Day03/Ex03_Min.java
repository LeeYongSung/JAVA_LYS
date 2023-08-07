package Day03;

import java.util.Scanner;

public class Ex03_Min {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt(); //입력할 개수
		 int arr[] = new int[input];
		for (int i = 0; i < input; i++) {
			arr[i] = sc.nextInt();
			
			System.out.println("배열 " + i + "번째는 " + arr[i] + " ");
		}
		int min = Integer.MAX_VALUE;		// int 타입의 최댓값
		for (int i = 0; i < arr.length; i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("최솟값은 : " + min);
		
		sc.close();
		
		
		
		
		
	}
}
