package Prototype;

public class EmployeeRecord implements Prototype {

    private int id;
    private String name, family, address;
    private double salary;

    private EmployeeRecord() {
        System.out.println("Employee Record:");
        System.out.println("----------------");
        System.out.println("Id" + "\t" + "Name" + "\t" + "Family" + "\t\t" + "Salary" + "\t\t" + "Address");
    }

    EmployeeRecord(int id, String name, String family, double salary, String address) {
        this();
        this.id = id;
        this.name = name;
        this.family = family;
        this.salary = salary;
        this.address = address;
    }

    void showRecord() {
        System.out.println(id + "\t" + name + "\t\t" + family + "\t\t" + salary + "\t\t" + address);
    }

    @Override
    public Prototype clone() {
        return new EmployeeRecord(id, name, family, salary, address);
    }
}