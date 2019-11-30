package com.company.tests;

public class CompanyIdFieldCheck extends Common {
    public void test() {
        try {
            String testString = "!COMPANY_ID:123";

            if (super.testString(testString)) {
                printResult("Company Id Field Check successful");
            } else {
                printResult("Company Id Field Check failed");
            }
        } catch (Exception e) {
            printResult("Exception in Company Id Field Check " + e.toString());
        }
    }
}
