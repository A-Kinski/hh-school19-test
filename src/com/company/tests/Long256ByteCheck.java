package com.company.tests;

import java.util.Random;

public class Long256ByteCheck extends Common {
    public void test() {
        try {
            StringBuilder testString = new StringBuilder();
            Random randomNumberGenerator = new Random();
            for (int i = 0; i < 256; i++) {
                testString.append((char) randomNumberGenerator.nextInt(26));
            }

            if (super.testString(testString.toString())) {
                printResult("256 Byte String Check successful");
            } else {
                printResult("256 Byte String Check failed");
            }
        } catch (Exception e) {
            printResult("Exception in 256 Byte String Check " + e.toString());
        }
    }
}
