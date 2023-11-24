package _1500;

import java.util.Scanner;

public class _1568 {
	
	public static int maxi(int n, int[] data, int a, int b) {
	    int max = data[a-1];
	    int maxIdx = a;

	    for (int i = a; i < b; i++) {
	        if (data[i] > max) {
	            max = data[i];
	            maxIdx = i + 1;
	        }
	    }

	    return maxIdx;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] data = new int[n];

		for (int i=0; i<n; i++) 
			data[i] = sc.nextInt();

		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.println(maxi(n, data, a, b));
		
		sc.close();
		
	}
}
