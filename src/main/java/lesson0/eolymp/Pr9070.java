package lesson0.eolymp;

public class Pr9070 {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(-3,6,-3,2,3,2);
        //Triangle triangle = new Triangle(1,2,-1,1,0,5);
        System.out.println(triangle.perimeter());
        System.out.println(triangle.area());
        System.out.println(triangle.inscribedRadius());
        System.out.println(triangle.describedRadius());
        triangle.Out();
    }

    static class Triangle {
        private int x1, y1, x2, y2, x3, y3;

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
            return 0.5 * Math.abs(x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        }

        public double perimeter(){
            return length(x1, y1, x2, y2) + length(x2, y2, x3, y3) + length(x3, y3, x1, y1);
        }

        public double inscribedRadius(){
            return 2 * area() / perimeter();
        }

        public double describedRadius(){
            return length(x1, y1, x2, y2) * length(x2, y2, x3, y3) * length(x3, y3, x1, y1) / (4 * area());
        }

        private double length(int x1, int y1, int x2, int y2){
            return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        }
    }
}
