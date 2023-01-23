package lesson0.eolymp;

import java.util.Scanner;

public class Pr11286 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] arr = new int[n+1];

        for(int i=1; i<=n; i++){
            arr[i] = in.nextInt();
        }

        for (int i = 1; i <= n; i++) {
            int count = 0;
            for (int j=i; j<=n; j++) {
                if(arr[j]>=arr[i] && arr[j]<=2*arr[i])
                    count++;
            }
            if(i < n) System.out.print(count + " ");
            else System.out.println(count);
        }
    }
}
