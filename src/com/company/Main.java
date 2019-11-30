package com.company;

import com.company.tests.Common;
import com.company.tests.HealthCheck;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Common> tests = List.of(
                new HealthCheck()
        );

        tests.forEach(test -> test.test());
    }

}
