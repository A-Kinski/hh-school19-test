package com.company.tests;

public class CompanyNameFieldCheck extends Common {
    public void test() {
        try {
            String testString = "COMPANY_NAME:HeadHunter";

            if (super.testString(testString)) {
                printResult("Company Name Field Check successful");
            } else {
                printResult("Company Name Field Check failed");
            }
        } catch (Exception e) {
            printResult("Exception in Company Name Field Check " + e.toString());
        }
    }
}
