package _1500;

import java.util.Scanner;

public class _1512 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int[][] b = new int[101][101];
		
		b[x][y]= 1;
		int v = b[x][y];
		
		for(int i = x-1; i >= 1; i--) {//i값 2 1 두번 실행
			b[i][y] = ++v; //위로
		}
	    v = b[x][y];
	    for(int i = x+1; i <= n; i++ ){ //i값 4 5 두번실행
	        b[i][y] = ++v; //아래로
	    }
	    
	    for(int i = 1; i <= n; i++){ // i값 1 2 3 4 5 다섯번 실행
	        v = b[i][y]; //b[i][y] 기준 왼쪽
	        for(int j = y-1; j >= 1; j-- ){ //j값 3 2 1 세번 실행
	            b[i][j] = ++v;
	        }
	        v = b[i][y];
	        for(int j = y+1; j <= n; j++ ){//오른쪽
	            b[i][j] = ++v;
	        }
	    }
		//출력
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
	}
}
