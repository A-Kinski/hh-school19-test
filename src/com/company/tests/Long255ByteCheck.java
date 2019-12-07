package com.company.tests;

import java.util.Random;

public class Long255ByteCheck extends Common {
    public void test() {
        try {
            StringBuilder testString = new StringBuilder();
            Random randomNumberGenerator = new Random();
            for (int i = 0; i < 255; i++) {
                testString.append((char) randomNumberGenerator.nextInt(26));
            }

            if (super.testString(testString.toString())) {
                printResult("255 Byte String Check successful");
            } else {
                printResult("255 Byte String Check failed");
            }
        } catch (Exception e) {
            printResult("Exception in 255 Byte String Check " + e.toString());
        }
    }
}
