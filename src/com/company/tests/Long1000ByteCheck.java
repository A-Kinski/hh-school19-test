package com.company.tests;

import java.util.Random;

public class Long1000ByteCheck extends Common {
    public void test() {
        try {
            StringBuilder testString = new StringBuilder();
            Random randomNumberGenerator = new Random();
            for (int i = 0; i < 1000; i++) {
                testString.append((char) randomNumberGenerator.nextInt(26));
            }

            if (super.testString(testString.toString())) {
                printResult("1000 Byte String Check successful");
            } else {
                printResult("1000 Byte String Check failed");
            }
        } catch (Exception e) {
            printResult("Exception in 1000 Byte String Check " + e.toString());
        }
    }
}
