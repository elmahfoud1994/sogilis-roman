package com.company.technical.services.impl;

import com.company.technical.services.interfaces.RomanInput;

import java.util.Scanner;

public class RomanInputImpl implements RomanInput {
    public String input() {
        System.out.println("Enter your roman string : ");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) return scanner.nextLine();
        else return "";
    }
}
