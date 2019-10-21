package com.baylorgenetics.catalog_qa.base;


import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;

public class URLTest {

public static void main(String[] args) {
    InputStream response = null;
    try {
        String url = "https://catalog-qa.baylorgenetics.com/search?";
        response = new URL(url).openStream();


        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(response);
        String responseBody = scanner.useDelimiter("\\A").next();
        System.out.println(responseBody.substring(responseBody.indexOf("<title>") + 7, responseBody.indexOf("</title>")));

    } catch (IOException ex) {
        ex.printStackTrace();
    } finally {
        try {
            response.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
}