package com.company.tests;

public class DecisionCheck extends Common {
    public void test() {
        try {
            //TODO string with decision
            String testString = "";

            if (super.testString(testString)) {
                printResult("Decision String Check successful");
            } else {
                printResult("Decision Byte String Check failed");
            }
        } catch (Exception e) {
            printResult("Exception in Decision Byte String Check " + e.toString());
        }
    }
}
