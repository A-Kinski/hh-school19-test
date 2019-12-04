package com.company.tests;

public class EOLCheck extends Common {
    public void test() {
        try {
            //TODO eol in java
            String testString = EOL;

            if (super.testString(testString)) {
                printResult("EOL String Check successful");
            } else {
                printResult("EOL String Check failed");
            }
        } catch (Exception e) {
            printResult("Exception in EOL String Check " + e.toString());
        }
    }
}
