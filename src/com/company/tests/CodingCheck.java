package com.company.tests;

public class CodingCheck extends Common {
    public void test() {
        try {
            String testString = new String("Разработчик на языке программирования Джава".getBytes("UTF-8"),
                    "windows-1251");

            if (super.testString(testString)) {
                printResult("Coding String Check successful");
            } else {
                printResult("Coding String Check failed");
            }
        } catch (Exception e) {
            printResult("Exception in Coding String Check " + e.toString());
        }
    }
}
