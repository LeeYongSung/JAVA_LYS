package _1200;

import java.util.Scanner;

public class _1285 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String[] num = a.split("\\+|\\-|\\*|/|\\=");
		String[] oper = a.split("1|2|3|4|5|6|7|8|9|0| ");
		String ns="";
		int result=0;
		for (int i = 0; i < oper.length; i++) {
			if (!oper[i].equals(" ")) {
				ns += oper[i];
			}
		}
		String[] oper2 = ns.split(""); 
		int[] num2 = new int[num.length];
		for (int i = 0; i < num.length; i++) {
			num2[i] = Integer.parseInt(num[i]);
		}
		try {
			for (int i = 0; i < oper2.length; i++) {
				if(oper2[i].equals("="))break;
				else {
					if(oper2[i].equals("+")) {
						num2[i+1] = num2[i] + num2[i+1];
					}else if(oper2[i].equals("-")) {
						num2[i+1] = num2[i] - num2[i+1];
					}else if(oper2[i].equals("*")) {
						num2[i+1] = num2[i] * num2[i+1];
					}else if(oper2[i].equals("/")) {
						num2[i+1] = num2[i] / num2[i+1];
					}
				}
			}
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(num2[num2.length-1]);
	}
}
