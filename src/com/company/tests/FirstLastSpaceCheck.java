package com.company.tests;

public class FirstLastSpaceCheck extends Common {
    public void test() {
        try {
            String testString = " Java ";

            if (super.testString(testString)) {
                printResult("First and Last Space Check successful");
            } else {
                printResult("First and Last Space Check failed");
            }
        } catch (Exception e) {
            printResult("Exception in First and Last Space Check " + e.toString());
        }
    }
}
