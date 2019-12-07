package com.company.tests;

public class HTMLInjectionCheck extends Common {
    public void test() {
        try {
            String injectionString = "<input id=\"html_injection\"></input>";

            if (super.testInjection(injectionString)) {
                printResult("HTML Injection Check successful");
            } else {
                printResult("HTML Injection Check failed");
            }
        } catch (Exception e) {
            printResult("Exception in HTML Injection Check " + e.toString());
        }
    }
}
