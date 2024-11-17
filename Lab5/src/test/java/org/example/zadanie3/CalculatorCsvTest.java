package org.example.zadanie3;

import org.example.zadanie1.Calculator;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorCsvTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv", numLinesToSkip = 1)
    void testWithCsvFileSource(int val1, int val2, int result) {
        Calculator calculator = new Calculator();
        assertEquals(result, calculator.multiply(val1, val2),
                "Multiplication result should match the expected value");
    }
}
