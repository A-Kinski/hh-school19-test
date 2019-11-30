package com.company.tests;

public class AsteriskCheck extends Common {
    public void test() {
        try {
            String testString = "Jav*";

            if (super.testString(testString)) {
                printResult("Asterisk Check successful");
            } else {
                printResult("Asterisk Check failed");
            }
        } catch (Exception e) {
            printResult("Exception in Asterisk Check " + e.toString());
        }
    }
}
