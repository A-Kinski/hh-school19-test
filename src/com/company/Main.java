package com.company;

import com.company.tests.*;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Common> tests = List.of(
                new HealthCheck(),
                new PhraseWithQuotes(),
                new PhraseWithoutQuotes(),
                new ExclamationPointCheck(),
                new AsteriskCheck(),
                new OrLiteralCheck(),
                new AndLiteralCheck(),
                new NotLiteralCheck(),
                new AllLiteralsCheck(),
                new IdFieldCheck(),
                new NameFieldCheck(),
                new CompanyIdFieldCheck(),
                new CompanyNameFieldCheck(),
                new DescriptionFieldCheck(),
                new AllFieldsCheck(),
                new NotSupportedFieldCheck()
        );

        tests.forEach(test -> test.test());
    }

}
