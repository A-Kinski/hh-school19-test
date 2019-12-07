package com.company.tests;

public class SpecialCharsCheck extends Common {
    public void test() {
        try {
            String testString = "\\{}/*-+=()<>`~";

            if (super.testString(testString)) {
                printResult("Special Chars Check successful");
            } else {
                printResult("Special Chars Check failed");
            }
        } catch (Exception e) {
            printResult("Exception in Special Chars Check " + e.toString());
        }
    }
}
