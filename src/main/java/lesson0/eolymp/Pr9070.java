package lesson0.eolymp;

public class Pr9070 {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(-3,6,-3,2,3,2);
        System.out.println(triangle.perimeter());
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

        public void Out(){
            System.out.println(x1 + " " + x2 + " " + y1 + " " + y2 + " " + x3 + " " + y3);
        }

        public double area(){
            return 0;
        }

        public double perimeter(){
            return length(x1, y1, x2, y2) + length(x2, y2, x3, y3) + length(x3, y3, x1, y1);
        }

        public double inscribedRadius(){
            return 0;
        }

        public double describedRadius(){
            return 0;
        }

        private double length(int x1, int y1, int x2, int y2){
            return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        }
    }
}
