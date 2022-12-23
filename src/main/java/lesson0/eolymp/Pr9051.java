package lesson0.eolymp;

public class Pr9051 {
    public static void main(String[] args) {
        Vector vector = new Vector(1,2,3);
        System.out.println(vector.length());
        vector.Out();
    }

    static class Vector {
        private int x,y,z;

        public Vector(){
            x = 0;
            y = 0;
            z = 0;
        }

        public Vector(int X, int Y, int Z){
            x = X;
            y = Y;
            z = Z;
        }

        public Vector(Vector v) {
            x = v.getX();
            y = v.getY();
            z = v.getZ();
        }

        public void setX(int X) {
            x = X;
        }

        public void setY(int Y) {
            y = Y;
        }

        public void setZ(int Z) {
            z = Z;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public int getZ() {
            return z;
        }

        public double length(){
            return Math.sqrt(x*x + y*y + z*z);
        }

        public void Out(){
            System.out.println(x + " " + y + " " + z);
        }
    }
}
