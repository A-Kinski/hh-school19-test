package com.company.tests;

public class Long256ByteCheck extends Common {
    public void test() {
        try {
            //TODO 256 byte string
            String testString = "";

            if (super.testString(testString)) {
                printResult("256 Byte String Check successful");
            } else {
                printResult("256 Byte String Check failed");
            }
        } catch (Exception e) {
            printResult("Exception in 256 Byte String Check " + e.toString());
        }
    }
}
