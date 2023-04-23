package lesson0.eolymp;

import java.util.Scanner;

public class Pr4448 {
    static char [][] used;
    static Pair4448 king, rook;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        used = new char[9][9];
        for(int i=1; i<=8; i++){
            for(int j=1; j<=8; j++){
                used[i][j] = '.';
            }
        }
        king = new Pair4448(getI(input.charAt(1)), getJ(input.charAt(0)));
        used[king.i][king.j] = 'K';
        int n = in.nextInt();
        in.nextLine();
        for(int i=1; i<=n; i++){
            input = in.nextLine();
            rook = new Pair4448(getI(input.charAt(1)), getJ(input.charAt(0)));
            used[rook.i][rook.j] = 'X';

            for(int j=1; j<=8; j++) used[rook.i][j] = 'X';
            for(int j=1; j<=8; j++) used[j][rook.j] = 'X';
        }

        /*for(int i=1; i<=8; i++){
            for(int j=1; j<=8; j++){
                System.out.print(used[i][j]);
            }
            System.out.println();
        }*/

        if(used[king.i][king.j] == 'X') System.out.println("Checkmate");
        else bfs();
    }

    private static int getI(int i){
        //System.out.println(i + " " + ((int)'8'+1-i));
        return (int)'8'+1-i;
    }

    private static int getJ(char c){
        //System.out.println(c + " " + ((int)c-(int)'a'+1));
        return (int)c-(int)'a'+1;
    }

    private static int returnI(int i){
        return 9-i;
    }

    private static char returnJ(int j){
        return (char)(96+j);
    }

    private static void bfs(){
        if(king.i > 1 && king.j > 1 && used[king.i-1][king.j-1] == '.')      System.out.println(returnJ(king.j-1) + "" + returnI(king.i-1)); // yuxari sola
        else if(king.i > 1 && used[king.i-1][king.j] == '.')                 System.out.println(returnJ(king.j) + "" + returnI(king.i-1)); // yuxari
        else if(king.i > 1 && king.j < 8 && used[king.i-1][king.j+1] == '.') System.out.println(returnJ(king.j+1) + "" + returnI(king.i-1)); // yuxari saga
        else if(king.j < 8 && used[king.i][king.j+1] == '.')                 System.out.println(returnJ(king.j+1) + "" + returnI(king.i)); // saga
        else if(king.i < 8 && king.j < 8 && used[king.i+1][king.j+1] == '.') System.out.println(returnJ(king.j+1) + "" + returnI(king.i+1)); // asagi saga
        else if(king.i < 8 && used[king.i+1][king.j] == '.')                 System.out.println(returnJ(king.j) + "" + returnI(king.i+1)); // asagi
        else if(king.i < 8 && king.j > 1 && used[king.i+1][king.j-1] == '.') System.out.println(returnJ (king.j-1) + "" + returnI(king.i+1)); // asagi sola
        else if(king.j > 1 && used[king.i][king.j-1] == '.')                 System.out.println(returnJ(king.j-1) + "" + returnI(king.i)); // sola
        else System.out.println("Stalemate");
    }
}

class Pair4448 {
    int i,j;
    public Pair4448(int i, int j){
        this.i = i;
        this.j = j;
    }
}