package _1000;

import java.util.Scanner;

public class _1092 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int first = sc.nextInt();
        int second = sc.nextInt();
        int three = sc.nextInt();
        boolean find = true;

        int day = 1;
        while (day % first != 0 || day % second != 0 || day % three != 0) {
            day++;
            if (day >= (Integer.MAX_VALUE)) {
                find = false;
                break;
            }
        }

        if (find) {
            System.out.println(day);
        }
		sc.close();
	}
}
