package com.company.tests;

public class DescriptionFieldCheck extends Common {
    public void test() {
        try {
            String testString = "DESCRIPTION: Зарплата от 100кк/нс";

            if (super.testString(testString)) {
                printResult("Description Field Check successful");
            } else {
                printResult("Description Name Check failed");
            }
        } catch (Exception e) {
            printResult("Exception in Description Field Check " + e.toString());
        }
    }
}
