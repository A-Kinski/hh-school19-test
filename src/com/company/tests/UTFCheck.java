package com.company.tests;

public class UTFCheck extends Common {
    public void test() {
        try {
            String testString = "àáâãäåçèéêëìíîðñòôõöö";

            if (super.testString(testString)) {
                printResult("UTF String Check successful");
            } else {
                printResult("UTF String Check failed");
            }
        } catch (Exception e) {
            printResult("Exception in UTF String Check " + e.toString());
        }
    }
}
