package com.company.tests;

public class SpaceStringCheck extends Common {
    public void test() {
        try {
            String testString = "      ";

            if (super.testString(testString)) {
                printResult("Space String Check successful");
            } else {
                printResult("Space String Check failed");
            }
        } catch (Exception e) {
            printResult("Exception in Space String Check " + e.toString());
        }
    }
}
