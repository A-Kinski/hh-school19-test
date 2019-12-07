package com.company.tests;

public class EOLCheck extends Common {
    public void test() {
        try {
            String testString = "Java\n\rPython";

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
