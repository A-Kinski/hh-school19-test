package com.company.tests;

public class PhraseWithQuotes extends Common{
    public void test() {
        try {
            String testString = "\"Java developer\"";

            if (super.testString(testString)) {
                printResult("Phrase With Quotes check successful");
            } else {
                printResult("Phrase With Quotes check failed");
            }
        } catch (Exception e) {
            printResult("Exception in Phrase With Quotes check " + e.toString());
        }
    }
}
