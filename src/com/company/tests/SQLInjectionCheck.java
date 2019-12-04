package com.company.tests;

public class SQLInjectionCheck extends Common {
    public void test() {
        try {
            //TODO SQL injection
            String injectionString = "";

            if (super.testInjection(injectionString)) {
                printResult("SQL Injection Check successful");
            } else {
                printResult("SQL Injection Check failed");
            }
        } catch (Exception e) {
            printResult("Exception in SQL Injection Check " + e.toString());
        }
    }
}
