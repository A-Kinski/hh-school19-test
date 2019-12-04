package com.company.tests;

public class Long255ByteCheck extends Common {
    public void test() {
        try {
            //TODO 255 byte string
            String testString = "";

            if (super.testString(testString)) {
                printResult("255 Byte String Check successful");
            } else {
                printResult("255 Byte String Check failed");
            }
        } catch (Exception e) {
            printResult("Exception in 255 Byte String Check " + e.toString());
        }
    }
}
