package lesson0.eolymp;

public class Pr9717 {
}

interface Fly9717 {
    void fly();
}

interface Eat9717 {
    void eat();
}

interface Sleep9717 {
    void sleep();
}

class Bird9717 implements Fly9717, Eat9717, Sleep9717 {
    public void fly(){ System.out.println("Bird flies");}
    public void eat(){ System.out.println("Bird eats");}
    public void sleep(){ System.out.println("Bird sleeps");}
}