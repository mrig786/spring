package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.*;

import org.json.JSONException;
import org.json.JSONObject;

public class URLTest {


    private static String readAll(Reader rd) throws IOException {
        StringBuilder sb = new StringBuilder();
        int cp;
        while ((cp = rd.read()) != -1) {
            sb.append((char) cp);
        }
        return sb.toString();
    }

    private static List<String> read(Reader rd) throws IOException {
        List<String> list=new ArrayList<>();
        List<String> stringList= new ArrayList<>();
        int cp;
        while (true){
            StringBuilder sb = new StringBuilder();
            while ((cp = rd.read()) != -1) {
                if(cp!=91 && cp!=123 && cp !=125 && cp!=34)
                  sb.append((char) cp);
                if(cp==125)
                    break;
            }
            if(cp==93 || cp==-1)
              break;
            cp=rd.read();
            list.add(sb.toString());
        }
        return list;
    }

    public static JSONObject readJsonFromUrl(String url) throws IOException, JSONException {
        InputStream is = new URL(url).openStream();
        try {
            BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
            List<String> stringList=read(rd);
            String jsonText = readAll(rd);

            jsonText = jsonText.substring(1, jsonText.length() - 1);
            JSONObject json = new JSONObject(jsonText);

/*
            Properties properties= new Properties();

            Map<String, String> keyValueMap = new HashMap<>();
            properties.load(is);

            for (Map.Entry<Object, Object> entry : properties.entrySet()) {
                keyValueMap.put(String.valueOf(entry.getKey()), String.valueOf(entry.getValue()));
            }*/

            return json;


        } finally {
            is.close();
        }
    }

    public static void main(String[] args) throws IOException, JSONException {
        JSONObject json = readJsonFromUrl("http://omegapp.redbus.in:8001/api/vendorroutes/6444");
        System.out.println(json.toString());
        System.out.println(json.get("vRouteId"));
    }

}
