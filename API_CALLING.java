package rest_api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class API_CALLING {

    public static String getCapitalCity(String country) throws IOException {
        String url = "https://jsonmock.hackerrank.com/api/countries?name=" + country;
        URL apiUrl = new URL(url);
        HttpURLConnection connection = (HttpURLConnection) apiUrl.openConnection();
        connection.setRequestMethod("GET");

        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        StringBuilder response = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            response.append(line);
        }
        reader.close();

        String jsonResponse = response.toString();
        String capitalCity = "";
        if (jsonResponse.contains("capital")) {
            int start = jsonResponse.indexOf("capital") + 10;
            int end = jsonResponse.indexOf("\"", start);
            capitalCity = jsonResponse.substring(start, end);
        } else {
            return "-1";
        }
        return capitalCity;
    }
    public static void main(String[] args)  throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter country: ");
        String country = reader.readLine();
        System.out.println(getCapitalCity(country));
    }
}
