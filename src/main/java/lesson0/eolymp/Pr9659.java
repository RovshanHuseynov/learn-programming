package lesson0.eolymp;

import java.util.ArrayList;
import java.util.Scanner;

public class Pr9659 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s, type, pS, pN, pA, tS, tSa;
        ListOfPeople9659 l = new ListOfPeople9659();
        while(in.hasNextLine()){
            s = in.nextLine();
            //System.out.println("s:" + s);
            type = s.split(" ")[0];
            if(type.equals("Person")){
                pS = s.split(" ")[1];
                pN = s.split(" ")[2];
                pA = s.split(" ")[3];
                Person9659 person = new Person9659(pS,pN,Integer.parseInt(pA));
                //System.out.println("person:" + person);
                l.add(person);
            } else if(type.equals("Teacher")){
                pS = s.split(" ")[1];
                pN = s.split(" ")[2];
                pA = s.split(" ")[3];
                tS = s.split(" ")[4];
                tSa = s.split(" ")[5];
                Teacher9659 teacher = new Teacher9659(pS,pN,Integer.parseInt(pA),tS,Integer.parseInt(tSa));
                //System.out.println("teacher: " + teacher);
                l.add(teacher);
            }
        }
        System.out.println(l.toString());
        //System.out.println(l.a.size());
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
        return Surname + " " + Name + " " + Age + "\n";
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
        return super.Surname + " " + super.Name + " " + super.Age + " " + Subject + " " + Salary + "\n";
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
        String ans = "";
        for(int i=0; i<size(); i++){
            ans = ans + a.get(i);
        }
        return ans;
    }
}
