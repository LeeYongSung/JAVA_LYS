package _1600;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _1630 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<String>();
		
		int num = sc.nextInt();
		String music = "";
		
		for (int i = 0; i < num; i++) {
			music = sc.next();
			list.add(music);
		}
		
		
		for (int i = 0; i < list.size(); i++) {
			if(i == 0) {
				System.out.println(list.get(i));
			} else if(i == list.size()){
				System.out.println(list.get(i));
			} else {
				System.out.println("AMOLED");
				System.out.println(list.get(i));
			}
		}
	}
}
