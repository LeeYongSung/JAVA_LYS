package Day11.Ex02_Util;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizerSum {

	
	// "1,2,3,4,5"
	// "," 분리 --> 1 2 3 4 5 (String)
	// 토큰을 int 타입으로 변환하여 합계를 구해보자
	public static void main(String[] args) {
		// 강사님 답안
		Scanner sc = new Scanner(System.in);
		String num = sc.nextLine();
		
		int sum = 0;
		StringTokenizer st = new StringTokenizer(num, ",");
		
		while (st.hasMoreTokens()) {
			int k = Integer.parseInt(st.nextToken());
			sum += k;
		}
		
		System.out.println(sum);
		
		sc.close();
		
//		String num = "1,2,3,4,5";
//		int numBox[] = new int[5];
//		int sum = 0;
//		StringTokenizer st = new StringTokenizer(num, ",");
//		
//		System.out.println(st.countTokens());
//		
//		for (int i = 0; i < numBox.length; i++) {
//			numBox[i] = Integer.parseInt(st.nextToken());
//			sum += numBox[i];
//		}
//		
//		System.out.println(sum);
	}
	
}
