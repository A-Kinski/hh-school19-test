package com.company.tests;

public class AllLiteralsCheck extends Common {
    public void test() {
        try {
            String testString = "(закупки AND канцтовары) " +
                    "OR (закупки AND \"канцелярские товары\") " +
                    "NOT секретарь NOT офис-менеджер NOT \"помощник руководителя\"";

            if (super.testString(testString)) {
                printResult("All Literals Check successful");
            } else {
                printResult("All Literals Check failed");
            }
        } catch (Exception e) {
            printResult("Exception in All Literal Check " + e.toString());
        }
    }
}
