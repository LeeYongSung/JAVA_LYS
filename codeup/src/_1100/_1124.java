package _1100;

import java.util.Scanner;

public class _1124 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		
		String b[] = a.split("");
		int arr[] = new int[8];
		if(b[0].equals("C") ) {
			for (int i = 1; i < b.length; i++) {
				if(!b[i].equals("H")) {
					int check = Integer.parseInt(b[i]);
					arr[i] = check;
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
