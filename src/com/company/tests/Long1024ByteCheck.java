package com.company.tests;

public class Long1024ByteCheck extends Common {
    public void test() {
        try {
            //TODO 1024 byte string
            String testString = "";

            if (super.testString(testString)) {
                printResult("1024 Byte String Check successful");
            } else {
                printResult("1024 Byte String Check failed");
            }
        } catch (Exception e) {
            printResult("Exception in 1024 Byte String Check " + e.toString());
        }
    }
}
