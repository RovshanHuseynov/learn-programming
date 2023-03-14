package lesson0.eolymp;

public class Pr9656 {
    public static void main(String[] args) {
    }
}

class Shape {
    private String shapeName;

    Shape(String name){ this.shapeName = name;}

    public String getShapeName() { return shapeName;}

    public String toString() { return shapeName; }
}

class Circle extends Shape {
    Circle(){ super("Circle"); }
}

class Rectanglee extends Shape {
    Rectanglee(){ super("Rectanglee"); }
}

class Triangle extends Shape {
    Triangle(){ super("Triangle"); }
}