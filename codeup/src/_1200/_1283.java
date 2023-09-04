package _1200;

import java.math.BigDecimal;
import java.util.Scanner;

public class _1283 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextInt();
		int b = sc.nextInt();
		double[] c = new double[b];
		BigDecimal income = new BigDecimal(a);
		int netGain = 0;

		for (int i = 0; i < b; i++) {
			c[i] = sc.nextInt();
		}
		for (int i = 0; i < b; i++) {
			income = income.add(income.multiply(BigDecimal.valueOf(c[i] * 0.01)));
		}
		netGain = (int) ((Math.round(income.doubleValue())) - a);

		String result = (netGain > 0) ? "good" : (netGain < 0) ? "bad" : "same";
		System.out.printf("%s\n%s", netGain, result);
		
		sc.close();
	}
}
