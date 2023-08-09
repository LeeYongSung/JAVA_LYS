package _1900;

import java.util.HashMap;
import java.util.Scanner;

public class _1916 {

public static int fn_DP_Fibonacci(int n, HashMap<Integer, Integer> dp) {
	if (dp.containsKey(n)) {
		// 이미 연산했던 적이 있다면, 그 값을 꺼내 돌려준다.
		return dp.get(n);
	} else if (n == 0) {	
		return 0;
	} else if (n <= 2) {
		return 1;
	} else {
		int value = fn_DP_Fibonacci(n - 1, dp) + (fn_DP_Fibonacci(n - 2, dp));
		dp.put(n, value);
		return value%10009;
	}
}

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	// DP 피보나치 재귀함수
	HashMap<Integer, Integer> dp = new HashMap<Integer, Integer>();
	// 중복연산 방지
	int n = sc.nextInt();
	int result = fn_DP_Fibonacci(n, dp);
	System.out.println(result);

	sc.close();
	}
}