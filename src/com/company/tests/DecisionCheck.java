package com.company.tests;

public class DecisionCheck extends Common {
    public void test() {
        try {
            String testString = "Java;Python,C++.Pascal:Erlang\u0009Lisp";

            if (super.testString(testString)) {
                printResult("Decision String Check successful");
            } else {
                printResult("Decision Byte String Check failed");
            }
        } catch (Exception e) {
            printResult("Exception in Decision Byte String Check " + e.toString());
        }
    }
}
