package com.company.tests;

public class AndLiteralCheck extends Common {
    public void test() {
        try {
            String testString = "Java AND python";

            if (super.testString(testString)) {
                printResult("And Literal Check successful");
            } else {
                printResult("And Literal Check failed");
            }
        } catch (Exception e) {
            printResult("Exception in And Literal Check " + e.toString());
        }
    }
}
