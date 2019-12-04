package com.company.tests;

public class Long257ByteClass extends Common {
    public void test() {
        try {
            //TODO 257 byte string
            String testString = "";

            if (super.testString(testString)) {
                printResult("257 Byte String Check successful");
            } else {
                printResult("257 Byte String Check failed");
            }
        } catch (Exception e) {
            printResult("Exception in 257 Byte String Check " + e.toString());
        }
    }
}
