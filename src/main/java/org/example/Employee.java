package org.example;

public class Employee {
    private String name;
    private Integer age;
    private String contractType;

    public Employee(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public String getContractType() {
        return contractType;
    }

    public Employee setContractType(String contractType) {
        this.contractType = contractType;
        return this;
    }
}
