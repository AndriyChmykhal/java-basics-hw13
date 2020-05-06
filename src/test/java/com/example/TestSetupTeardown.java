package com.example;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestSetupTeardown {
    @BeforeClass
    public void beforeClass() {
        System.out.println("beforeClass");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("afterClass");
    }

    @Test
    public void test() {
        System.out.println("test");
    }

}


/* @BeforeGroups("database")
public void setupDB() {}

@AfterGroups("database")
public void cleanDB() {}*/

/*Create Gradle project with TestNG support, use 'org.testng:testng:6.14.3'

Create simple test with setup/teardown methods, each method should output it’s name in a console

Create test class with several test groups
group dependency
group-specific setup/teardown methods
exclude one from test execution

Create test class with 2 parameterized test methods
parameters from testng.xml
parameters from DataProvider

Create class with 3 test methods that are executed from the bottom to the top of the class using priority*/