package com.company.tests;

public class Long2048ByteCheck extends Common {
    public void test() {
        try {
            //TODO 2048 byte string
            String testString = "";

            if (super.testString(testString)) {
                printResult("2048 Byte String Check successful");
            } else {
                printResult("2048 Byte String Check failed");
            }
        } catch (Exception e) {
            printResult("Exception in 2048 Byte String Check " + e.toString());
        }
    }
}
