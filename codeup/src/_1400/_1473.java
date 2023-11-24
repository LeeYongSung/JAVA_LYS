package _1400;

import java.util.Scanner;

public class _1473 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int arr[][] = new int[a][b];
		int count = a*b;
		
		if(a%2!=0) {
			for (int i = 0; i < a; i++) {
				if(i%2==0)
				for (int j = b-1; j >= 0; j--) {
					arr[i][j]=count;
					count--;
				}
				else if(i%2 !=0)
				for (int j = 0; j < b; j++) {
					arr[i][j]=count;
					count--;					
				}
			}
		}else if(a % 2 == 0){
			for (int i = 0; i < a; i++) {
				if(i%2 ==0)
				for (int j = 0; j < b; j++) {
					arr[i][j]=count;
					count--;
				}
				else if(i%2 !=0)
				for (int j = b-1; j >= 0; j--) {
					arr[i][j]=count;
					count--;						
				}
			}
		}
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
