package com.company.tests;

public class OneSpaceCheck extends Common {
    public void test() {
        try {
            String testString = "Senior Java";

            if (super.testString(testString)) {
                printResult("One Space Check successful");
            } else {
                printResult("One Space Check failed");
            }
        } catch (Exception e) {
            printResult("Exception in One Space Check " + e.toString());
        }
    }
}
