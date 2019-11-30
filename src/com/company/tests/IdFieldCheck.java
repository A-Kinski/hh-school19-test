package com.company.tests;

public class IdFieldCheck extends Common {
    public void test() {
        try {
            String testString = "!ID:123";

            if (super.testString(testString)) {
                printResult("ID Field Check successful");
            } else {
                printResult("ID Field Check failed");
            }
        } catch (Exception e) {
            printResult("Exception in ID Field Check " + e.toString());
        }
    }
}
