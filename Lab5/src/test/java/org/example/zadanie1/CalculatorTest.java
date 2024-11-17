package org.example.zadanie1;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTest {
    Calculator calculator;
    @BeforeEach
    void init() {
        calculator = new Calculator();
    }
    @Test
    @DisplayName("Multiplication of calculator")
    void testMultiply() {
        assertEquals(10, calculator.multiply(2, 5),
                "Multiplication should work");
    }
    @RepeatedTest(10)
    @DisplayName("Ensure correct multiplication by zero")
    void testMultiplicationByZero() {
        assertEquals(0, calculator.multiply(0, 10),
                "Multiplication by zero should be zero");
        assertEquals(0, calculator.multiply(1, 0),
                "Multiplication by zero should be zero");
    }
    @RepeatedTest(10)
    @DisplayName("Ensure correct multiplication by one")
    void testMultiplicationByOne() {
        assertEquals(10, calculator.multiply(1, 10),
                "Multiplication ten by one should be ten");
        assertEquals(5, calculator.multiply(1, 5),
                "Multiplication five by one should be five");
    }

    @Test
    @DisplayName("Addition of calculator")
    void testAdd() {
        assertEquals(5, calculator.add(2, 3), "Addition should work");
        assertEquals(0, calculator.add(-3, 3), "Addition of negatives and positives should work");
        assertEquals(-7, calculator.add(-4, -3), "Addition of negatives should work");
    }

    @Test
    @DisplayName("Subtraction of calculator")
    void testSubtract() {
        assertEquals(2, calculator.subtract(5, 3), "Subtraction should work");
        assertEquals(-8, calculator.subtract(-5, 3), "Subtraction with negatives should work");
        assertEquals(0, calculator.subtract(3, 3), "Subtraction of equal numbers should work");
    }

    @Test
    @DisplayName("Division of calculator")
    void testDivide() {
        assertEquals(2, calculator.divide(10, 5), "Division should work");
        assertEquals(-2, calculator.divide(-10, 5), "Division with negatives should work");
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(10, 0),
                "Division by zero should throw an exception");
    }

}
