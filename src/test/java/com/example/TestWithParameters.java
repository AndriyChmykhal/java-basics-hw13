package com.example;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class TestWithParameters {

    @DataProvider(name = "provider")
    public static Object[][] provider() {
        return new Object[][]{
                {"data1"}, {"data2"}
        };
    }

    @Test
    @Parameters("testType")
    public void parametrizedTest(String testType) {
        System.out.println("I'm running " + testType);
    }

    @Test(dataProvider = "provider")
    public void dataProviderMethod(String data) {
        System.out.println("Provided data is " + data);
    }

}
