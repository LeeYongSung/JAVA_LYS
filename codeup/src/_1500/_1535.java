package _1500;

import java.util.Scanner;

public class _1535 {
	
	static public void a(int b[], int n) {
		
		int count = 1;
		
		for (int i = 0; i < b.length; i++) {
			if(b.length != 1) {
				if(b.length != n) {
					if(b[i] < b[i+1]) {
						count++;
					} else if(b[i] == b[i+1]){
						
					} else {
						count = count;						
					}
				} else {
					count = b.length;
				}
			} else {
				count = 1;
			}
		}
		
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int arr[] = new int[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		a(arr, N);
	}
}
