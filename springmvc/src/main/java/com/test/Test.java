package com.test;

import org.joda.time.DateTime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Pattern;

public class Test {
    public static final String DATEFORMAT_yyyyMMddHHmmss = "yyyy-MM-dd HH:mm:ss";
    public static void main(String[] args) {
        try{
            /*String row="vRouteId:15926-2127996900000135827,RouteId:14915013,IsExpired:0";

            String[] keyVal = row.split(",");
            Long ssRouteId = Long.parseLong(keyVal[0].split(":")[1].split("-")[1].trim());
            String vedorServiceId = keyVal[1].split(":")[1].trim();
            System.out.println(ssRouteId+" : "+vedorServiceId);*/
/*
            String from="2020-05-05 00:00:00";
            Date fromDate = parseDate(from, DATEFORMAT_yyyyMMddHHmmss);*/

            /*Calendar cal = Calendar.getInstance();
            cal.setTime(new Date());
            cal.add(Calendar.DATE,-50);
            System.out.println(cal.getTime());
            System.out.println(new Date());
            String str="ACBC"+23l+"cb";
            System.out.println(str);*/

//            List<ServiceIdMapRecord> serviceIdMapRecords=new ArrayList<>();
//            serviceIdMapRecords.add(new ServiceIdMapRecord(10l,20l,"A",30l));
//            serviceIdMapRecords.add(new ServiceIdMapRecord(11l,21l,"A",31l));
//            serviceIdMapRecords.add(new ServiceIdMapRecord(12l,22l,"A",32l));
//
//            String s="sdns: "+ Arrays.toString(serviceIdMapRecords.toArray());
//            System.out.println(s);

            Long primeDepartureTime=960l;
            long noOfDays = primeDepartureTime / 1440;

            String dojrny="2020-01-29 00:00:00";
            Date doj = parseDate(dojrny, DATEFORMAT_yyyyMMddHHmmss);

            Date date = new DateTime(doj).minusDays((int) noOfDays).plusMinutes(primeDepartureTime.intValue())
                    .toDate();
            String pr="2020-02-11 20:11:45";
            Date processDate = parseDate(pr, DATEFORMAT_yyyyMMddHHmmss);
            System.out.println(doj);
            System.out.println(date);
            System.out.println(processDate);

            boolean isDOJPast= processDate.after(date);
            System.out.println(isDOJPast);

        }catch (Exception e){
            e.printStackTrace();
        }
    }


    public static Date parseDate(String stringDate, String pattern) throws ParseException {
        final SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
        return dateFormat.parse(stringDate);
    }
}
