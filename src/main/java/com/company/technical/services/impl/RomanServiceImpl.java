package com.company.technical.services.impl;

import com.company.technical.services.interfaces.RomanInput;
import com.company.technical.services.interfaces.RomanService;

public class RomanServiceImpl implements RomanService {

    private RomanInput romanInputImpl = new RomanInputImpl();

    public int convertToInt() {
        String roman = romanInputImpl.input();
        if (roman == null || roman.length() == 0) return -1;
        roman = roman.toUpperCase();
        int count = 0;
        for (int i = 0; i < roman.length(); i++) {
            if (roman.charAt(i) == 'I') count++;
        }
        return (count != 0) ? count : -1;

    }
}
