package com.company.tests;

import java.net.HttpURLConnection;
import java.net.URL;

public class HealthCheck extends Common {

    public void test() {
        try {
            URL url = new URL("https://api.hh.ru/vacancies?text=Java");

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            int code = connection.getResponseCode();

            if (code == HttpURLConnection.HTTP_OK) {
                printResult("Health check successful");
            } else {
                printResult("Health check failed with code" + code);
            }
        } catch (Exception e) {
            printResult("Exception in health check " + e.toString());
        }
    }
}
