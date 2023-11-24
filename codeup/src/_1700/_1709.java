package _1700;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class _1709 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		int a = sc.nextInt();
		
		for (int i = 0; i < a; i++) {
			int b = sc.nextInt();
			list.add(b);
		}
		
		Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1); // 두 값의 순서를 반대로 비교
            }
        });
		
		for (Integer integer : list) {
			System.out.print(integer + " ");
		}
	}
}
