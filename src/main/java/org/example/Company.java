package org.example;

import java.util.ArrayList;

public class Company {
    private ArrayList<Employee> employees;

    private String name;

    public Company(ArrayList<Employee> employees, String name) {
        this.employees = employees;
        this.name = name;
    }

    public void hireEmployee(Employee employee) {

        if(employee.getAge() < 16) { // 1
            throw new Error("The company can't hire someone under 16 years old"); // 2
        }
        else if(16 <= employee.getAge() && employee.getAge() < 18) { // 3
            this.employees.add(employee.setContractType("part-time")); // 4
        }
        else if(18 <= employee.getAge() && employee.getAge() < 55) { // 5
            this.employees.add(employee.setContractType("full-time")); // 6
        }
        else { // 7
            throw new Error("The company can't hire someone over 55 years old"); // 8
        }
    }
    public ArrayList<Employee> getEmployees() {
        return employees;

    }
}
