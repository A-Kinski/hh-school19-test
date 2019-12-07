package com.company.tests;

import java.util.Random;

public class Long2048ByteCheck extends Common {
    public void test() {
        try {
            StringBuilder testString = new StringBuilder();
            Random randomNumberGenerator = new Random();
            for (int i = 0; i < 2048; i++) {
                testString.append((char) randomNumberGenerator.nextInt(26));
            }

            if (super.testString(testString.toString())) {
                printResult("2048 Byte String Check successful");
            } else {
                printResult("2048 Byte String Check failed");
            }
        } catch (Exception e) {
            printResult("Exception in 2048 Byte String Check " + e.toString());
        }
    }
}
