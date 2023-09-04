package _1400;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _1430 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int a = bf.read();
		int arr1[] = new int[a];
		
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = bf.read();
		}
		
 		int b = bf.read();
 		int arr2[] = new int[b];
 		
 		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = bf.read();
		}
 		bf.close();
 		int [] out = new int[arr2.length];
		
		for(int i = 0; i < arr2.length; i++) {
			for(int j = 0 ; j <arr1.length; j++) {
				if(arr2[i] == arr1[j]) {
				out[i] = 1;
				} 
			}	
		}
		for(int i = 0; i < out.length; i++) { // 결과출력용
			bw.flush();
			
		} 
 		
	}
}
