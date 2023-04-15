package lesson0.eolymp;

import java.util.Scanner;

public class Pr9652 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        MyLong9652 myLong = new MyLong9652(in.nextLong());
        myLong.Add(in.nextLong());
        System.out.println(myLong);
    }
}

class MyLong9652
{
    private final long a;
    MyLong9652(long a) {
        this.a = a;
    }
    public String toString() {
        return String.valueOf(a);
    }
    public MyLong9652 Add(MyLong9652 b) {
        return Add(b.a);
    }
    public MyLong9652 Add(long b) {
        return new MyLong9652(a + b);
    }
}
