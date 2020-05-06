package com.example;

import org.testng.annotations.Test;

public class TestUsingPriority {
    @Test(priority = 2)
    public void lowPriority() {
        System.out.println("Low Priority");
    }

    @Test(priority = 1)
    public void mediumPriority() {
        System.out.println("Medium priority");
    }

    @Test
    public void highPriority() {
        System.out.println("High priority");
    }
}
