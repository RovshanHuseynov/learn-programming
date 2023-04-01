package lesson0.eolymp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Pr4019 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int [][] a = new int[n+1][m+1];
        List<String> ans = new ArrayList<>();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                a[i][j] = in.nextInt();
            }
        }

        for(int i=1; i<=n; i++){
            a[i][1] += a[i-1][1];
        }

        for(int j=1; j<=m; j++){
            a[1][j] += a[1][j-1];
        }

        for(int i=2; i<=n; i++){
            for(int j=2; j<=m; j++){
                a[i][j] += Math.min( a[i-1][j] , a[i][j-1]);
            }
        }

        /*for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }*/

        System.out.println(a[n][m]);
        int i=n, j=m;
        while(i>1 || j>1){
            ans.add(i + " " + j);
            //System.out.println(i + " " + j);
            if(i==1) j--;
            else if(j==1) i--;
            else if(a[i-1][j] < a[i][j-1]) i--;
            else j--;
        }
        ans.add(i + " " + j);
        //System.out.println(i + " " + j);

        Collections.reverse(ans);
        ans.forEach(System.out::println);
    }
}
