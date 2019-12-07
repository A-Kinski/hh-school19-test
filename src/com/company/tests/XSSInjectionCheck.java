package com.company.tests;

public class XSSInjectionCheck extends Common {
    public void test() {
        try {
            String injectionString = "<input onclick=\"javascript:alert('xss');\">";

            if (super.testInjection(injectionString)) {
                printResult("XSS Injection Check successful");
            } else {
                printResult("XSS Injection Check failed");
            }
        } catch (Exception e) {
            printResult("Exception in XSS Injection Check " + e.toString());
        }
    }
}
