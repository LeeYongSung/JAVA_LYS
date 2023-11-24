package _1300;

import java.util.Scanner;

public class _1360 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = n;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= count; j++) {
                System.out.print(count + " ");
            }
            count--;
            System.out.println();
        }
		sc.close();
	}
}
