package com.company.tests;

public class ExclamationPointCheck extends Common {
    public void test() {
        try {
            String testString = "!Секретарь";

            if (super.testString(testString)) {
                printResult("Exclamation Point Check successful");
            } else {
                printResult("Exclamation Point Check failed");
            }
        } catch (Exception e) {
            printResult("Exception in Exclamation Point Check " + e.toString());
        }
    }
}
