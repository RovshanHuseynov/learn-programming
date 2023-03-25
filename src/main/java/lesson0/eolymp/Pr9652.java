package lesson0.eolymp;

import java.util.Scanner;

public class Pr9652 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        MyLong myLong = new MyLong(in.nextLong());
        myLong.Add(in.nextLong());
        System.out.println(myLong);
    }
}

class MyLong
{
    private final long a;
    MyLong(long a) {
        this.a = a;
    }
    public String toString() {
        return String.valueOf(a);
    }
    public MyLong Add(MyLong b) {
        return Add(b.a);
    }
    public MyLong Add(long b) {
        return new MyLong(a + b);
    }
}
