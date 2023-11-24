package _1300;

import java.util.Scanner;

public class _1362 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
        int count = 1;

        for (int i = n * (n + 1) / 2; i > 0; ) {
            for (int j = 0; j < count && i > 0; j++) {
                System.out.print(i + " ");
                i--;
            }
            System.out.println();
            count++;
        }
		
	}
}