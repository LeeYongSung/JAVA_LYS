package _1100;

import java.math.BigInteger;
import java.util.Scanner;

public class _1128 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        BigInteger big = new BigInteger("123456789");
        BigInteger result = big.multiply(BigInteger.valueOf(n));

        System.out.println(result);
	}
}
