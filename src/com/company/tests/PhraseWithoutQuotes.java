package com.company.tests;

public class PhraseWithoutQuotes extends Common {
    public void test() {
        try {
            String testString = "Java developer";

            if (super.testString(testString)) {
                printResult("Phrase Without Quotes check successful");
            } else {
                printResult("Phrase Without Quotes check failed");
            }
        } catch (Exception e) {
            printResult("Exception in Phrase Without Quotes check " + e.toString());
        }
    }
}
