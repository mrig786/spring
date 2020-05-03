package com.test;

import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        try{
            String row="vRouteId:15507-21223592000000717530,RouteId:9410055,IsExpired:0";
            String[] keyVal = row.split(",");
            Long ssRouteId = Long.parseLong(keyVal[0].split(":")[1].split("-")[1].trim());
            String vedorServiceId = keyVal[1].split(":")[1].trim();
            System.out.println(ssRouteId+" : "+vedorServiceId);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
