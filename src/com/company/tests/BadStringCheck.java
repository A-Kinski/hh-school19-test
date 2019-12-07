package com.company.tests;

public class BadStringCheck extends Common {
    public void test() {
        try {
            String testString = "\"[|]'~<!--@/*$%^&#*/()?>,.*/\\";

            if (super.testString(testString)) {
                printResult("Bad String Check successful");
            } else {
                printResult("Bad String Check failed");
            }
        } catch (Exception e) {
            printResult("Exception in Bad String Check " + e.toString());
        }
    }
}
