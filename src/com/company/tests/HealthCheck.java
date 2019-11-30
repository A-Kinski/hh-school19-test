package com.company.tests;

public class HealthCheck extends Common {

    public void test() {
        try {
            String testString = "Java";

            if (super.testString(testString)) {
                printResult("Health check successful");
            } else {
                printResult("Health check failed");
            }
        } catch (Exception e) {
            printResult("Exception in health check " + e.toString());
        }
    }
}
