package com.hl.service;

public class DemoService {

    public String toUpperCase(String str){
        str += "suffix";
        return str.toUpperCase();
    }

    public String toLowerCase(String str){
        return str.toLowerCase();
    }

    public String concatStr(String sourceStr, String targetStr){
        return sourceStr + targetStr;
    }
}
