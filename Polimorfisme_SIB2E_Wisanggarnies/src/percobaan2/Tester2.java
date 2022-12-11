package percobaan2;

import percobaan1.Employee;
import percobaan1.PermanentEmployee;

public class Tester2 {
    public static void main(String[] args) {
        PermanentEmployee pEmp = new PermanentEmployee("Detik", 500);
        Employee e;
        e = pEmp;
        System.out.println("" + e.getEmployeeInfo());
        System.out.println("--------------------");
        System.out.println("" + pEmp.getEmployeeInfo());
    }
}
