package org.example;

import java.util.ArrayList;

public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Company netflix = new Company(new ArrayList<>(), "Netflix Ltda");
        Employee adult = new Employee("Lucas", 18);

        netflix.hireEmployee(adult);
        System.out.println( "Employees: " + netflix.getEmployees() );
    }
}
