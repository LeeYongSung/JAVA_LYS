package _1200;

import java.util.Scanner;

public class _1205 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		
		double c,d,e,f,g,h,i,j,k,l;
		
		c = a + b;
		d = b + a;
		e = a - b;
		f = b - a;
		g = a * b;
		h = b * a;
		i = a / b;
		j = b / a;
		k = Math.pow(a, b);
		l = Math.pow(b, a);
		
		double arr[] = {c,d,e,f,g,h,i,j,k,l};
		double max = arr[0];
		for (int m = 0; m < arr.length; m++) {
			if(max < arr[m]) {
				max = arr[m];
			}
		}
		System.out.printf("%.6f", max); 
		
	}
}
