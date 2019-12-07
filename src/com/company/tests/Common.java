package com.company.tests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
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
            printResult("Exception in http connection " + e.toString());
        }
        return false;
    }

    public boolean testInjection(String injectionString) {
        try {
            URL url = new URL(API_URL + injectionString);

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            int code = connection.getResponseCode();

            BufferedReader rd  = null;
            StringBuilder sb = null;
            String line = null;
            try {
                rd  = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                sb = new StringBuilder();

                while ((line = rd.readLine()) != null)
                {
                    sb.append(line + '\n');
                }

            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (ProtocolException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            if (code == HttpURLConnection.HTTP_BAD_REQUEST) {
                if (sb == null) {
                    return true;
                } else {
                    return false;
                }
            }

            if (code == HttpURLConnection.HTTP_OK ) {
                if (sb != null) {
                    if (sb.toString().indexOf(injectionString) == -1) {
                        return true;
                    } else {
                        return false;
                    }

                } else {
                    return false;
                }
            }
        } catch (Exception e) {
            printResult("Exception in http connection " + e.toString());
        }
        return false;
    }

    void printResult(String msg) {
        System.out.println(msg);
    }

}
