package com.company.tests;

public class Long2000ByteCheck extends Common {
    public void test() {
        try {
            //TODO 2000 byte string
            String testString = "";

            if (super.testString(testString)) {
                printResult("2000 Byte String Check successful");
            } else {
                printResult("2000 Byte String Check failed");
            }
        } catch (Exception e) {
            printResult("Exception in 2000 Byte String Check " + e.toString());
        }
    }
}
