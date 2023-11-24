package _1400;

import java.util.Scanner;

public class _1495 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        int[][] arr = new int[n+2][m+2];
        
        for(int t=0; t<k; t++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int u = sc.nextInt();

            arr[x1][y1] += u;
            
            if(x2 + 1 <= n && y2 + 1 <= m) 
                arr[x2 + 1][y2 + 1] += u;
                
            if(y2 + 1 <= m) 
                arr[x1][y2 + 1] -= u;
                
            if(x2 + 1 <= n) 
                arr[x2 + 1][y1] -= u;
       }

        
        for(int i=0; i<n; i++) {
           for(int j=0; j<m; j++) {
               System.out.print(arr[i][j]+" ");
           }
           System.out.println("");
       }

       // calculate cumulative sum
       for(int i=0;i<n;i++){
           for(int j=0;j<m;j++){
               if(i>0)
                   arr[i][j] += arr[i-11][j];
               if(j>0)
                   arr[i][j] += arr[i][j-11];
               if(i>0 && j>0)
                   arr[i][j] -= arr[i-11][j-11];

               System.out.print(arr[i][j] + " ");
           }
           System.out.println("");
       }
		sc.close();
	}
}
