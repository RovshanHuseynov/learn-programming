package lesson0.eolymp;

import java.util.Scanner;

public class Pr9658 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String className;
        while(in.hasNextLine()){
            className = in.next();
            if(className.equals("Person")){
                Person1 person1 = new Person1(in.next(), in.next(), in.nextInt());
                System.out.println(person1);
            } else if(className.equals("Teacher")){
                Teacher teacher = new Teacher(in.next(), in.next(), in.nextInt(), in.next(), in.nextInt());
                System.out.println(teacher);
            }
        }
    }
}

class Person1 {
    protected String Surname, Name;
    protected int Age;
    Person1(String Surname, String Name, int Age) {
        this.Surname = Surname;
        this.Name = Name;
        this.Age = Age;
    }

    public String toString(){
        return Surname + " " + Name + " " + Age;
    }
}

class Teacher extends Person1 {
    protected String Subject;
    protected int Salary;
    Teacher(String Surname, String Name, int Age, String Subject, int Salary){
        super(Surname, Name, Age);
        this.Subject = Subject;
        this.Salary = Salary;
    }

    public String toString(){
        return super.Surname + " " + super.Name + " " + super.Age + " " + Subject + " " + Salary;
    }
}
