package com.example.service1.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Response {
    private Person data;
    private Map<String, String> headers;

    public Person getData() {
        return data;
    }

    public void setData(Person data) {
        this.data = data;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public void setHeaders(Map<String, String> headers) {
        this.headers = headers;
    }
}