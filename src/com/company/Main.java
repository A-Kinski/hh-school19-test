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
                new NotSupportedFieldCheck(),
                new BadStringCheck(),
                new BadSymbolCheck(),
                new CodingCheck(),
                new CRLFStringCheck(),
                new DecisionCheck(),
                new DigitsCheck(),
                new EmptyStringCheck(),
                new EOLCheck(),
                new FirstLastSpaceCheck(),
                new HTMLInjectionCheck(),
                new Long100ByteCheck(),
                new Long255ByteCheck(),
                new Long256ByteCheck(),
                new Long257ByteClass(),
                new Long1024ByteCheck(),
                new Long2000ByteCheck(),
                new Long2048ByteCheck(),
                new OneSpaceCheck(),
                new RussianLettersCheck(),
                new SpaceStringCheck(),
                new SpecialCharsCheck(),
                new SQLInjectionCheck(),
                new UTFCheck(),
                new XSSInjectionCheck()
        );

        tests.forEach(test -> test.test());
    }

}
