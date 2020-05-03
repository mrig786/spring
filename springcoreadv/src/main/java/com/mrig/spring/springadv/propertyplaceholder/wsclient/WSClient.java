package com.mrig.spring.springadv.propertyplaceholder.wsclient;

public class WSClient {
    private String url;
    private String user;
    private String password;
    public WSClient(String url, String user, String password) {
        this.url = url;
        this.user = user;
        this.password = password;
    }


    @Override
    public String toString() {
        return "WSClient{" +
                "url='" + url + '\'' +
                ", user='" + user + '\'' +
                ", password='" + password + '\'' +
                '}';
    }


}
