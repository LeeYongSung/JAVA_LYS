package _1000;

import java.util.Scanner;

public class _1091 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long m = sc.nextLong();
        long d = sc.nextLong();
        long n = sc.nextLong();

        long result = a;

        for (int i = 1; i < n; i++) {
            result = (result * m)+d;
        }

        System.out.println(result);
		sc.close();
	}
}
