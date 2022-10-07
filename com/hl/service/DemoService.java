package com.hl.service;

public class DemoService {

    public String toUpperCase(String str){
        str += "suffix";
        return str.toUpperCase();
    }

    public String toLowerCase(String str){
        str += "prefix";
        return str.toLowerCase();
    }

    public String concatStr(String sourceStr, String targetStr){
        sourceStr += "he";
        return sourceStr + targetStr;
    }
}
