package com.company.technical.services.impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanInputImplTest {
    private RomanInputImpl romanInputImpl;

    @BeforeEach
    public void initialize() {
        romanInputImpl = new RomanInputImpl();
    }

    @Test
    public void shouldReturnIIfIwasEntred() {
        System.setIn(new ByteArrayInputStream("I".getBytes()));
        assertEquals("I", romanInputImpl.input());
    }

    @Test
    void shouldReturniIfiwasIntered() {
        System.setIn(new ByteArrayInputStream("i".getBytes()));
        assertEquals("i", romanInputImpl.input());
    }

    @Test
    public void shouldReturnAbcIfAbcWasEntered() {
        System.setIn(new ByteArrayInputStream("Abc".getBytes()));
        assertEquals("Abc", romanInputImpl.input());
    }

    @Test
    void shouldReturnEmptyIfEmptyStringWasEntered() {
        System.setIn(new ByteArrayInputStream("".getBytes()));
        assertEquals("", romanInputImpl.input());
    }

}
