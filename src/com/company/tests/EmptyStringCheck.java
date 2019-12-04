package com.company.tests;

public class EmptyStringCheck extends Common {
    public void test() {
        try {
            String testString = "";

            if (super.testString(testString)) {
                printResult("Empty String Check successful");
            } else {
                printResult("Empty String Check failed");
            }
        } catch (Exception e) {
            printResult("Exception in Empty String Check " + e.toString());
        }
    }
}
