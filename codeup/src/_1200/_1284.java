package _1200;

import java.util.ArrayList;
import java.util.Scanner;

public class _1284 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    int input1 = scan.nextInt();
	    scan.close();
	    ArrayList<Integer> arr1 = new ArrayList<>();
	    ArrayList<Integer> arr2 = new ArrayList<>();
	    for(int i = 2 ; i < input1 ; i++) {
	    	if(input1%i == 0) {
	    		arr1.add(i);
	    	}
	    }
	    if(arr1.size() == 2 ) {
	    	for(int i = 1 ; i <= arr1.get(0) ; i++) {
	    		if(arr1.get(0)%i == 0) {
	    	    	arr2.add(i);
	    	    }
	        }
	    	for(int i = 1 ; i <= arr1.get(1) ; i++) {
	    		if(arr1.get(1)%i == 0) {
	    	    	arr2.add(i);
	    	    }
	        }
	    	if(arr2.size() == 4 ) {
	        	System.out.println(arr1.get(0)+" "+arr1.get(1));
	        }
	        else {
	        	System.out.println("wrong number");
	        }
	    }
	    else {
	    	System.out.println("wrong number");
	    }
	}
}
