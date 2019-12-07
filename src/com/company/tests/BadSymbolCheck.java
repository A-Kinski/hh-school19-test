package com.company.tests;

public class BadSymbolCheck extends Common {
    public void test() {
        try {
            String testString = "♣ ☺ ♂";

            if (super.testString(testString)) {
                printResult("Bad Symbol Check successful");
            } else {
                printResult("Bad Symbol Check failed");
            }
        } catch (Exception e) {
            printResult("Bad Symbol Byte String Check " + e.toString());
        }
    }
}
