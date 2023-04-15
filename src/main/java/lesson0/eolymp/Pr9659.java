package lesson0.eolymp;

import java.util.ArrayList;
import java.util.Scanner;

public class Pr9659 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String className;
        ListOfPeople9659 l = new ListOfPeople9659();
        while(in.hasNextLine()){
            className = in.next();
            if(className.equals("Person")){
                Person9659 person = new Person9659(in.next(), in.next(), in.nextInt());
                l.add(person);
            } else if(className.equals("Teacher")){
                Teacher9659 teacher = new Teacher9659(in.next(), in.next(), in.nextInt(), in.next(), in.nextInt());
                l.add(teacher);
            }
        }
        System.out.println(l.toString());
    }
}

class Person9659 {
    protected String Surname, Name;
    protected int Age;
    Person9659(String Surname, String Name, int Age) {
        this.Surname = Surname;
        this.Name = Name;
        this.Age = Age;
    }

    public String toString(){
        return Surname + " " + Name + " " + Age;
    }
}

class Teacher9659 extends Person9659 {
    protected String Subject;
    protected int Salary;

    public Teacher9659(String Surname, String Name, int Age, String Subject, int Salary){
        super(Surname, Name, Age);
        this.Subject = Subject;
        this.Salary = Salary;
    }

    public String toString(){
        return super.Surname + " " + super.Name + " " + super.Age + " " + Subject + " " + Salary;
    }
}

class ListOfPeople9659{
    ArrayList<Person9659> a = new ArrayList<>();

    public void add(Person9659 p){
        a.add(p);
    }

    public int size(){
        return a.size();
    }

    public String toString(){
        return a.toString();
    }
}
