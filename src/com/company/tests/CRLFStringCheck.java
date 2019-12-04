package com.company.tests;

public class CRLFStringCheck extends Common {
    public void test() {
        try {
            String testString = "Java\n\rDeveloper";

            if (super.testString(testString)) {
                printResult("CRLF String Check successful");
            } else {
                printResult("CRLF String Check failed");
            }
        } catch (Exception e) {
            printResult("Exception in CRLF String Check " + e.toString());
        }
    }
}
