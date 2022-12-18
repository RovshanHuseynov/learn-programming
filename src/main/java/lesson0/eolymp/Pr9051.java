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
            this.x = 0;
            this.y = 0;
            this.z = 0;
        }

        public Vector(int x, int y, int z){
            this.x = x;
            this.y = y;
            this.z = z;
        }

        public Vector(Vector v) {
            this.x = v.getX();
            this.y = v.getY();
            this.z = v.getZ();
        }

        public void setX(int x) {
            this.x = x;
        }

        public void setY(int y) {
            this.y = y;
        }

        public void setZ(int z) {
            this.z = z;
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
