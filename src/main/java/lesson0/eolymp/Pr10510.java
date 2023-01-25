package lesson0.eolymp;

import java.util.Scanner;

public class Pr10510 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int temp;
        int [] listA = new int[n];
        int [] listB = new int[n];
        for(int i=0; i<n; i++){
            listA[i] = in.nextInt();
        }
        for(int i=0; i<n; i++){
            listB[i] = in.nextInt();
        }

        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-1; j++){
                if(listA[j] > listA[j+1]){
                    temp = listA[j];
                    listA[j] = listA[j+1];
                    listA[j+1] = temp;

                    temp = listB[j];
                    listB[j] = listB[j+1];
                    listB[j+1] = temp;
                }
            }
        }

        for(int i=0; i<n; i++){
            System.out.println(listB[i]);
        }
    }
}
