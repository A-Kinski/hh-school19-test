package com.company.tests;

public class OrLiteralCheck extends Common {
    public void test() {
        try {
            String testString = "Java OR python";

            if (super.testString(testString)) {
                printResult("Or Literal Check successful");
            } else {
                printResult("Or Literal Check failed");
            }
        } catch (Exception e) {
            printResult("Exception in Or Literal Check " + e.toString());
        }
    }
}
