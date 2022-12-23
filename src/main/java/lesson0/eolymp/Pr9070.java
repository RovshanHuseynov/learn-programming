package lesson0.eolymp;

public class Pr9070 {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.Out();
    }

    static class Triangle {
        public int x1, y1, x2, y2, x3, y3;

        public Triangle() {
            this.x1 = 0;
            this.y1 = 0;
            this.x2 = 0;
            this.y2 = 0;
            this.x3 = 0;
            this.y3 = 0;
        }

        public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
            this.x3 = x3;
            this.y3 = y3;
        }

        public void Out(){}

        public double area(){
            return 0;
        }

        public double perimeter(){
            return 0;
        }

        public double inscribedRadius(){
            return 0;
        }

        public double describedRadius(){
            return 0;
        }
    }
}
