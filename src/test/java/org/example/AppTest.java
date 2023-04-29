package org.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class AppTest {

    @Test
    public void testCompany()
    {
        Company company = new Company(new ArrayList<>(), "company");
        company.hireEmployee(new Employee("Hammer", 18));
        Assert.assertTrue(true);
    }
}
