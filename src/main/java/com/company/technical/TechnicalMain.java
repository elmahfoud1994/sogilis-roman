package com.company.technical;

import com.company.technical.services.impl.RomanServiceImpl;
import com.company.technical.services.interfaces.RomanService;
import netscape.javascript.JSObject;

import java.io.*;
import java.util.Scanner;

public class TechnicalMain {
    public static void main(String[] args) {
        RomanService romanService = new RomanServiceImpl();
        int result =romanService.convertToInt();
        System.out.println(result);
    }
}
