package com.company;

class Employee {
    int salary;
    String name;
    public int getSalary() {
        return salary;

    }
    public String getName() {
        return name;
    }
    public String setName(String n) {
         name = n;
         return name;
    }
}
public class EmployeeClassGetterSetter_08 {
    public static void main(String[] args) {
        Employee John = new Employee();
        John.setName("How Are You");
        System.out.println(John.getName());
    }
}

