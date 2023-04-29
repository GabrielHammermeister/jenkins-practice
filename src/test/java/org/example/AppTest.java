package org.example;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class AppTest {
    Company netflix = new Company(new ArrayList<>(), "Netflix Ltda");
    Employee underAge = new Employee("emp1", 12);
    Employee partTime = new Employee("emp2", 16);
    Employee fullTime = new Employee("emp3", 30);
    Employee senior = new Employee("emp4", 60);

    @Test
    public void shouldCheckEmployeesAge() {
        netflix.hireEmployee(fullTime);
        assertEquals(netflix.getEmployees().size(), 1);
        assertEquals(fullTime.getContractType(), "full-time");
        netflix.hireEmployee(partTime);
        assertEquals(netflix.getEmployees().size(), 2);
        assertEquals(partTime.getContractType(), "part-time");
        try {
            netflix.hireEmployee(underAge);
        } catch (Error error) {
            assertEquals(netflix.getEmployees().size(), 2);
            assertEquals(error.getMessage(), "The company can't hire someone under 16 years old");
        }
    }

    @Test(expected = Error.class)
    public void shouldNotHireSenior() {
        netflix.hireEmployee(senior);
        assertEquals(netflix.getEmployees().size(), 2);
    }
}
