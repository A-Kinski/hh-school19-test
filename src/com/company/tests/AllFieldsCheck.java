package com.company.tests;

public class AllFieldsCheck extends Common {
    public void test() {
        try {
            String testString = "NAME:(python OR java) and COMPANY_NAME:Headhunter" +
                    " OR !ID=123 AND !COMPANY_ID=321 OR DESCRIPTION=описание вакансии";

            if (super.testString(testString)) {
                printResult("All Fields Check successful");
            } else {
                printResult("All Fields Check failed");
            }
        } catch (Exception e) {
            printResult("Exception in All Fields Check " + e.toString());
        }
    }
}
