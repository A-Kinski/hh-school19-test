package com.company.tests;

public class RussianLettersCheck extends Common {
    public void test() {
        try {
            String testString = "Секретарь";

            if (super.testString(testString)) {
                printResult("Russian Letters Check successful");
            } else {
                printResult("Russian Letters Check failed");
            }
        } catch (Exception e) {
            printResult("Exception in Russian Letters Check " + e.toString());
        }
    }
}
