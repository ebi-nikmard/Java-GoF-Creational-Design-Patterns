package Prototype;

import java.util.List;

/**
 * Prototype: Specify the kinds of objects to create using a prototypical instance, and create new objects by copying this prototype.
 */

public class Client {

    public static void main(String args[]) {
        EmployeeRecord record = new EmployeeRecord(1, "Ali", "Rahmani" ,100.5 , "Iran, Tehran" );
        record.showRecord();

        EmployeeRecord record2 = (EmployeeRecord) record.clone();
        record2.showRecord();

        System.out.println("---------------\n");

        Employee emp = new Employee();
        emp.loadData();

        Employee empAddTest = (Employee) emp.clone();
        Employee empRemoveTest = (Employee) emp.clone();

        List<String> list = empAddTest.getEmpList();
        list.add("AddTest");

        List<String> list1 = empRemoveTest.getEmpList();
        list1.remove("Ali");

        System.out.println("emp List: "+emp.getEmpList());
        System.out.println("emp AddTest List: "+list);
        System.out.println("emp Remove Ali List: "+list1);

    }
}
