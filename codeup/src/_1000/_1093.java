package _1000;

import java.util.Scanner;

public class _1093 {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] std = new int[23];
        int n = sc.nextInt();

        for (int i=0; i<n; i++) {
            std[sc.nextInt()-1]++;
        }

        for(int i=0; i<std.length;i++) {
            System.out.print(std[i]+" ");
        }
	}
}
