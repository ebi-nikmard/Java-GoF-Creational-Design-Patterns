package Prototype;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Prototype{

    private List<String> empList;

    Employee(){
        empList = new ArrayList<>();
    }

    Employee(List<String> list){
        this.empList=list;
    }

    void loadData(){
        empList.add("Ali");
        empList.add("Mahdi");
        empList.add("Reza");
        empList.add("Javad");
    }

    List<String> getEmpList() {
        return empList;
    }

    @Override
    public Object clone(){
        List<String> temp = new ArrayList<>(this.getEmpList());
        return new Employee(temp);
    }
}