package lesson0.eolymp;

import java.util.Scanner;
import java.util.stream.Stream;

public class Pr10496 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        RegularPolygon10496[] rpArray = new RegularPolygon10496[n];
        String input, name;
        double len;
        in.nextLine();
        for(int i=0; i<n; i++){
            input = in.nextLine();
            name = input.split(" ")[0];
            len = Double.parseDouble(input.split(" ")[1]);

            if(name.equals("Triangle")){ rpArray[i] = new EquilateralTriangle10496(len);}
            else if(name.equals("Square")){ rpArray[i] = new Square10496(len);}

            System.out.printf("%s %.4f\n", name, rpArray[i].getSideLength());
            System.out.printf("Perimeter: %.4f\n", rpArray[i].getPerimeter());
            System.out.printf("Interior angle: %.4f\n", rpArray[i].getInteriorAngle());
        }
        System.out.printf("Total sides: " + RegularPolygon10496.totalSide(rpArray));
    }
}

interface RegularPolygon10496 {
    int getNumSides();
    double getSideLength();

    static int totalSide(RegularPolygon10496[] rpArray){
        return Stream.of(rpArray).map(val -> val.getNumSides()).mapToInt(val -> val).sum();
    }
    default double getPerimeter(){ return getNumSides() * getSideLength(); }
    default double getInteriorAngle(){ return (getNumSides()-2)* Math.PI / getNumSides();}
}

class EquilateralTriangle10496 implements RegularPolygon10496 {
    private double sideLength;

    public EquilateralTriangle10496(double sideLength) {this.sideLength = sideLength;}
    public int getNumSides() { return 3; }
    public double getSideLength() { return sideLength; }
    public String toString(){ return String.valueOf(sideLength); }
}

class Square10496 implements RegularPolygon10496 {
    private double sideLength;
    public Square10496(double sideLength){ this.sideLength = sideLength;}
    public int getNumSides() { return 4; }
    public double getSideLength() { return sideLength; }
    public String toString() { return String.valueOf(sideLength);}
}