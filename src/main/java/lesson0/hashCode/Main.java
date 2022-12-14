package lesson0.hashCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Main {
    // source video: https://www.youtube.com/watch?v=CpVALR9HeTE
    // source video: https://www.youtube.com/watch?v=-oafFAPgLao
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = new String("Hello");
        String s3 = "Hello";
        System.out.println("s1 == s2: " + (s1 == s2));
        System.out.println("s1.hashCode(): " + s1.hashCode());
        System.out.println("s2.hashCode(): " + s2.hashCode());
        System.out.println("s1.equals(s2): " + s1.equals(s2));
        System.out.println("s1.equals(s3): " + (s1 == s3));

        System.out.println("-------------------------------");
        Map<Employee, String> map = new HashMap<>();
        map.put(new Employee("Rovshan", 30), "first");
        System.out.println(map.get(new Employee("Rovshan", 30)));

        /* map.get(object) - object.hashCode() & (capacity - 1) düsturuna əsasən gedib lazım olan
        bucketi tapır. əgər hashCode() methodunu override etməmişiksə map.get() düzgün işləməyəcək
        yəni gedib biz istədiyimiz elementi tapıb gətirə bilməyəcək
         */

        Employee emp1 = new Employee("Rovshan", 30);
        Employee emp2 = new Employee("Rovshan", 30);

        System.out.println("emp1 == emp2: " + (emp1 == emp2));
        System.out.println("emp1.equals(emp2): " + emp1.equals(emp2));
        System.out.println("emp1: " + emp1);
        System.out.println("emp2: " + emp2);
        System.out.println("emp1.hashCode(): " + emp1.hashCode());
        System.out.println("emp2.hashCode(): " + emp2.hashCode());
        Objects.hash();

        Employee emp3 = null;
        // hashCode of a null must be 0
        System.out.println(Objects.hashCode(emp3));

        /* results when hashCode method is overridden
        false
        true
        lesson0.hashCode.Employee@5d578d4
        lesson0.hashCode.Employee@5d578d4
        97876180
        97876180
        first
         */

        /* results when hashCode method is NOT overridden
        false
        true
        lesson0.hashCode.Employee@2133c8f8
        lesson0.hashCode.Employee@43a25848
        557041912
        1134712904
        null
         */

        System.out.println("-------------------------------");
        Object o1 = new Object();
        Object o2 = o1;
        Object o3 = new Object();
        // default impl of Object class equals() method
        // because it checks pointing references, addresses
        System.out.println(o1.equals(o2)); // true
        System.out.println(o1.equals(o3)); // false
        System.out.println(o1.hashCode());
        System.out.println(o2.hashCode());
        System.out.println(o3.hashCode());
    }
}
