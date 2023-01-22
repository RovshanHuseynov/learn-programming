package lesson0.eolymp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pr10995 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        List<Long> listSquares = new ArrayList<>();
        List<Long> listCubes = new ArrayList<>();

        int i=1;
        while((long) i *i <= 1000000000L){
            listSquares.add((long)i*i);
            i++;
        }
        i=1;
        while((long)i*i*i <= 1000000000L){
            if(!listSquares.contains((long)i*i*i)) listCubes.add((long)i*i*i);
            i++;
        }

        for(i=0; i<t; i++){
            int ans = 0;
            int n = in.nextInt();

            for (Long listSquare : listSquares) {
                if (listSquare <= n) ans++;
                else break;
            }
            for (Long listCube : listCubes) {
                if (listCube <= n) ans++;
                else break;
            }
            System.out.println(ans);
        }
    }
}