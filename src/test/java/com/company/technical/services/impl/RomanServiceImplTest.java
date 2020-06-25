package com.company.technical.services.impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanServiceImplTest {
    private RomanServiceImpl romanServiceImpl;

    @BeforeEach
    public void initialize() {
        romanServiceImpl = new RomanServiceImpl();
    }

    @Test
    public void shouldReturnOneIfRomanIsI() {
        System.setIn(new ByteArrayInputStream("I".getBytes()));
        assertEquals(1, romanServiceImpl.convertToInt());
    }

    @Test
    public void shouldReturnTwoIfRomanIsII() {
        System.setIn(new ByteArrayInputStream("II".getBytes()));
        assertEquals(2, romanServiceImpl.convertToInt());
    }

    @Test
    public void shouldReturnThreeIfRomanIsIII() {
        System.setIn(new ByteArrayInputStream("III".getBytes()));
        assertEquals(3, romanServiceImpl.convertToInt());
    }

    @Test
    public void shouldReturnOneIfRomanIsi() {
        System.setIn(new ByteArrayInputStream("i".getBytes()));
        assertEquals(1, romanServiceImpl.convertToInt());
    }

    @Test
    public void shouldReturnNegativeOneIfEmptyString() {
        System.setIn(new ByteArrayInputStream("".getBytes()));
        assertEquals(-1, romanServiceImpl.convertToInt());
    }

    @Test
    public void shouldReturnNegativeOneIfNull() {
        // assertEquals(-1, romanServiceImpl.convertToInt(null));
    }

    @Test
    public void shouldReturnNegativeOneIfInvalid() {
        System.setIn(new ByteArrayInputStream("fsfsd".getBytes()));
        assertEquals(-1, romanServiceImpl.convertToInt());
    }


}
