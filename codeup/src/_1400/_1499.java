package _1400;

import java.util.Scanner;

public class _1499 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int g = sc.nextInt();
		int[] b = new int[101];
		for (int i = 0; i < n; i++) {
			b[i]=sc.nextInt();
		}
		for (int i = 0; i < n; i+=g) {
			int max = b[i];
			for (int j = i; j < i+g; j++) {//첫회전 i=0 j=0 j < 3 / 0,1,2
				if(j<n) {
					if(max < b[j])max=b[j];
				}
			}
			System.out.print(max+" ");
		}
	}
}
