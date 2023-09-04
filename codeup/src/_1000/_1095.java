package _1000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class _1095 {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
        for (int i = 0; i < a; i++) {
        	int b = sc.nextInt();
			arr.add(b);
		}
        
        Collections.sort(arr);
        
        
        System.out.println(arr.get(0));
        
	}
}
