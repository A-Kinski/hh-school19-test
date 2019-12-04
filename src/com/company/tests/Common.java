package com.company.tests;

import java.net.HttpURLConnection;
import java.net.URL;

public abstract class
Common {

    static final String API_URL = "https://api.hh.ru/vacancies?text=";

    public abstract void test();

    public boolean testString(String testString) {
        try {
            URL url = new URL(API_URL + testString);

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            int code = connection.getResponseCode();

            //if (code == HttpURLConnection.HTTP_OK || code == HttpURLConnection.HTTP_BAD_REQUEST) {
            if (code == HttpURLConnection.HTTP_OK) {
                return true;
            }
        } catch (Exception e) {
            printResult("Exception in health check " + e.toString());
        }
        return false;
    }

    public boolean testInjection(String injectionString) {
        try {
            URL url = new URL(API_URL + testString);

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            int code = connection.getResponseCode();
            String response = connection.getResponse();

            //if (code == HttpURLConnection.HTTP_OK || code == HttpURLConnection.HTTP_BAD_REQUEST) {
            if (code == HttpURLConnection.HTTP_OK) {
                //TODO parse JSON
                return true;
            }
        } catch (Exception e) {
            printResult("Exception in health check " + e.toString());
        }
        return false;
    }

    void printResult(String msg) {
        System.out.println(msg);
    }

}
