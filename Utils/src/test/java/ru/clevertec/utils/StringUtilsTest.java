package ru.clevertec.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    void isPositiveNumber() {
        assertTrue(StringUtils.isPositiveNumber("2"));
        assertTrue(StringUtils.isPositiveNumber("7.21"));
        assertFalse(StringUtils.isPositiveNumber("-9"));
        assertFalse(StringUtils.isPositiveNumber("-6.3"));
        assertFalse(StringUtils.isPositiveNumber("0"));
    }
}