package lesson0.eolymp;

import java.util.Scanner;

public class Pr4448_2 {
    static char [][] used;
    static Pair4448_2 king, rook;

    public static void main(String[] args) {
        used = new char[9][9];
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= 8; j++) {
                used[i][j] = '.';
            }
        }

        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        king = new Pair4448_2(setRow(input.charAt(1)), setColumn(input.charAt(0)));
        used[king.i][king.j] = 'K';

        int n = in.nextInt();
        in.nextLine();
        for(int i=1; i<=n; i++){
            input = in.nextLine();
            rook = new Pair4448_2(setRow(input.charAt(1)), setColumn(input.charAt(0)));
            used[rook.i][rook.j] = 'R';

            for(int j=1; j<=8; j++) used[rook.i][j] = 'R';
            for(int j=1; j<=8; j++) used[j][rook.j] = 'R';
        }

        /*for(int i=1; i<=8; i++){
            for(int j=1; j<=8; j++){
                System.out.print(used[i][j]);
            }
            System.out.println();
        }*/

        if(used[king.i][king.j] == 'R') System.out.println("Checkmate");
        else bfs();
    }

    private static int setRow(int row){ return 57 - row; }

    private static int setColumn(int column){ return column - 96; }

    private static int getRow(int row){ return 9 - row; }

    private static char getColumn(int column){ return (char)(96 + column); }

    private static void bfs(){
        if(king.i > 1 && king.j > 1 && used[king.i-1][king.j-1] == '.') System.out.println(getColumn(king.j-1) + "" + getRow(king.i-1)); // yuxari sola
        else if(king.i > 1 && used[king.i-1][king.j] == '.') System.out.println(getColumn(king.j) + "" + getRow(king.i-1)); // yuxari
        else if(king.i > 1 && king.j < 8 && used[king.i-1][king.j+1] == '.') System.out.println(getColumn(king.j+1) + "" + getRow(king.i-1)); // yuxari saga
        else if(king.j < 8 && used[king.i][king.j+1] == '.') System.out.println(getColumn(king.j+1) + "" + getRow(king.i)); // saga
        else if(king.i < 8 && king.j < 8 && used[king.i+1][king.j+1] == '.') System.out.println(getColumn(king.j+1) + "" + getRow(king.i+1)); // asagi saga
        else if(king.i < 8 && used[king.i+1][king.j] == '.') System.out.println(getColumn(king.j) + "" + getRow(king.i+1)); // asagi
        else if(king.i < 8 && king.j > 1 && used[king.i+1][king.j-1] == '.') System.out.println(getColumn(king.j-1) + "" + getRow(king.i+1)); // asagi sola
        else if(king.j > 1 && used[king.i][king.j-1] == '.') System.out.println(getColumn(king.j-1) + "" + getRow(king.i)); // sola
        else System.out.println("Stalemate");
    }
}

class Pair4448_2 {
    int i,j;
    public Pair4448_2(int i, int j){
        this.i = i;
        this.j = j;
    }
}