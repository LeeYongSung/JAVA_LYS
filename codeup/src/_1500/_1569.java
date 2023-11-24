package _1500;

import java.util.Scanner;

public class _1569 {
	
	public static int findi(int n, int[] data, int k) {
	    int start = 0;
	    int end = n - 1;

	    while (start <= end) {
	        int mid = (start + end) / 2;

	        if (data[mid] == k)
	        	
	        		return mid + 1;
	        else if (data[mid] < k)
	            start = mid + 1;
	        else
	            end = mid - 1;
	    }

	    return -1; // Not found
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] data = new int[n];

		for (int i=0; i<n; i++) 
			data[i] = sc.nextInt();

		int k = sc.nextInt();

		System.out.println(findi(n, data, k));
		
		sc.close();
		
	}
}
