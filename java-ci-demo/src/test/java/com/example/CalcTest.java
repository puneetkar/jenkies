package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalcTest {
    @Test
    void testAddIntegers() {
        Calc calc = new Calc();
        assertEquals(5, calc.add(2, 3));
    }

    @Test
    void testAddNegative() {
        Calc calc = new Calc();
        assertEquals(-1, calc.add(2, -3));
    }

    @Test
    void testDivNormal() {
        Calc calc = new Calc();
        assertEquals(2.5, calc.div(5.0, 2.0));
    }

    @Test
    void testDivZero() {
        Calc calc = new Calc();
        assertThrows(ArithmeticException.class, () -> calc.div(1.0, 0.0));
    }
}

