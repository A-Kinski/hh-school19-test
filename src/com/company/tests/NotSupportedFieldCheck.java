package com.company.tests;

public class NotSupportedFieldCheck extends Common {
    public void test() {
        try {
            String testString = "NOT_SUPPORTED_FIELD: value of not supported field";

            if (super.testString(testString)) {
                printResult("Not Supported Field Check successful");
            } else {
                printResult("Not Supported Field Check failed");
            }
        } catch (Exception e) {
            printResult("Exception in Not Supported Field Check " + e.toString());
        }
    }
}
