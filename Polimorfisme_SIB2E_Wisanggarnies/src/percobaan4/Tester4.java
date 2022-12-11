package percobaan4;

import percobaan1.ElectricityBill;
import percobaan1.IntershipEmployee;
import percobaan1.PermanentEmployee;

public class Tester4 {
    public static void main(String[] args) {
        Owner ow = new Owner();
        ElectricityBill eBill = new ElectricityBill(5, "R-1");
        ow.pay(eBill);// pay for electricity bill
        System.out.println("--------------------------------");

        PermanentEmployee pEmp = new PermanentEmployee("Detik", 500);
        ow.pay(pEmp);// pay for permanent employee
        System.out.println("--------------------------------");

        IntershipEmployee iEmp = new IntershipEmployee("Sunarto", 5);
        ow.showMyEmployee(pEmp);// show permanent employee info
        System.out.println("--------------------------------");
        ow.showMyEmployee(iEmp);//show internship emplyee info
        ow.pay(iEmp);
    }
}
