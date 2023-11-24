package _1400;

import java.util.Arrays;
import java.util.Scanner;

public class _1415 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int odd[] = new int[10];
		int even[] = new int[10];
		
		for (int i = 0; i < even.length; i++) {
			int a = sc.nextInt();
			
			if(a%2 == 0) {
				even[i] = a;
			} else {
				odd[i] = a;
			}
		}
		
		Arrays.sort(odd);
		Arrays.sort(even);
		
		if(odd[9] != 0 && even[9] != 0) {
			System.out.println(odd[9] + " " + even[9]);			
		} else if(odd[9] == 0) {
			System.out.println(even[9] + " ");
		} else if(even[9] == 0) {
			System.out.println(odd[9] + " ");
		}
	}
}
