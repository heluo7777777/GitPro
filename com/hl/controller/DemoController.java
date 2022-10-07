package com.hl.controller;

import com.hl.service.DemoService;

public class DemoController {

    DemoService demoService = new DemoService();

    public String testStr1(String str){
        return demoService.toUpperCase(str);
    }

    public String testStr2(String str){
        return demoService.toLowerCase(str);
    }

    public String testStr3(String sourceStr, String targetStr){
        return demoService.concatStr(sourceStr, targetStr);
    }
}
