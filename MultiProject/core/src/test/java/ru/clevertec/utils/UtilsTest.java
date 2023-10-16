package ru.clevertec.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilsTest {

    @Test
    void testIsAllPositiveNumbers() {
        assertTrue(Utils.isAllPositiveNumbers("12", "79"));
    }
}