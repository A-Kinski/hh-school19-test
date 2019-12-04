package com.company.tests;

public class DigitsCheck extends Common {
    public void test() {
        try {
            String testString = "1234567890";

            if (super.testString(testString)) {
                printResult("Digits Check successful");
            } else {
                printResult("Digits Check failed");
            }
        } catch (Exception e) {
            printResult("Exception in Digits Check " + e.toString());
        }
    }
}
