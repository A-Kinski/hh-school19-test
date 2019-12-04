package com.company.tests;

public class Long100ByteCheck extends Common {
    public void test() {
        try {
            //TODO 1000 byte string
            String testString = "";

            if (super.testString(testString)) {
                printResult("1000 Byte String Check successful");
            } else {
                printResult("1000 Byte String Check failed");
            }
        } catch (Exception e) {
            printResult("Exception in 1000 Byte String Check " + e.toString());
        }
    }
}
