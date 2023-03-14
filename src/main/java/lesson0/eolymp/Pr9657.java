package lesson0.eolymp;

public class Pr9657 {
    public static void main(String[] args) {
    }
}

class Rectangle {
    private int a,b;

    Rectangle(int a, int b){
        this.a = a;
        this.b = b;
    }

    public int Area(){ return a*b;}

    public int Perimeter(){ return 2 * (a+b);}
}

class Square extends Rectangle {
    Square(int a){
        super(a,a);
    }
}