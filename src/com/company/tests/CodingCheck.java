package com.company.tests;

public class CodingCheck extends Common {
    public void test() {
        try {
            //TODO coding
            String testString = "";

            if (super.testString(testString)) {
                printResult("Coding String Check successful");
            } else {
                printResult("Coding String Check failed");
            }
        } catch (Exception e) {
            printResult("Exception in Coding String Check " + e.toString());
        }
    }
}
