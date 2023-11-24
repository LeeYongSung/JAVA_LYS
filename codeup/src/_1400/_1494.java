package _1400;

import java.util.Scanner;

public class _1494 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] d = new int[101];
		int s=0,e=0,u=0;
		int sum = 0;
		for (int i = 0; i < k; i++) {
			s =sc.nextInt();
			e =sc.nextInt();
			u =sc.nextInt();
			d[s] = d[s]+u;
			d[e+1] = d[e+1]-u;
		}
		for (int i = 1; i < n+1; i++) {
			System.out.print(d[i]+" ");
		}
		System.out.println();
		for (int i = 1; i < n+1; i++) {
			sum +=d[i];
			System.out.print(sum+" ");
		}
	}
}
