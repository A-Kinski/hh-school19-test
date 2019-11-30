package com.company.tests;

public class NameFieldCheck extends Common {
    public void test() {
        try {
            String testString = "NAME:Java";

            if (super.testString(testString)) {
                printResult("Name Field Check successful");
            } else {
                printResult("Name Field Check failed");
            }
        } catch (Exception e) {
            printResult("Exception in Name Field Check " + e.toString());
        }
    }
}
