package org.example.zadanie2;

import org.example.zadanie1.Calculator;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

class DynamicCalculatorTest {

    @TestFactory
    Stream<DynamicTest> testDifferentMultiplications() {
        Calculator calculator = new Calculator();
        int[][] data = new int[][]{{1, 2, 2}, {2, 3, 6}, {4, 1, 4}};
        return Arrays.stream(data).map(entry -> {
            int val1 = entry[0];
            int val2 = entry[1];
            int result = entry[2];
            return dynamicTest(val1 + " * " + val2 + " = " + result,
                    () -> assertEquals(result, calculator.multiply(val1, val2)));
        });
    }

    @TestFactory
    Stream<DynamicTest> testDifferentDivisions() {
        Calculator calculator = new Calculator();
        int[][] data = new int[][]{{6, 2, 3}, {9, 3, 3}, {4, 0, 0}};
        return Arrays.stream(data).map(entry -> {
            int val1 = entry[0];
            int val2 = entry[1];
            int result = entry[2];
            return dynamicTest(val1 + " / " + val2 + (val2 != 0 ? " = " + result : " throws exception"),
                    () -> {
                        if (val2 == 0) {
                            assertThrows(ArithmeticException.class, () -> calculator.divide(val1, val2),
                                    "Division by zero should throw an ArithmeticException.");
                        } else {
                            assertEquals(result, calculator.divide(val1, val2));
                        }
                    });
        });
    }
}
