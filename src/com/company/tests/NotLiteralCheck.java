package com.company.tests;

public class NotLiteralCheck extends Common {
    public void test() {
        try {
            String testString = "Java NOT javascript";

            if (super.testString(testString)) {
                printResult("Not Literal Check successful");
            } else {
                printResult("Not Literal Check failed");
            }
        } catch (Exception e) {
            printResult("Exception in Or Literal Check " + e.toString());
        }
    }
}
