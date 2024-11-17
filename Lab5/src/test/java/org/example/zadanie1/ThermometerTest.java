package org.example.zadanie1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ThermometerTest {
    Thermometer thermometer;

    @BeforeEach
    void init() {
        thermometer = new Thermometer(-10, 50);
    }

    @Test
    @DisplayName("Test assertNotEquals: Temperatures should differ after update")
    void testAssertNotEquals() {
        thermometer.setCurrentTemp(20);
        assertNotEquals(10, thermometer.getCurrentTemp(),
                "Current temperature should not be equal to 10 after setting it to 20");
    }

    @Test
    @DisplayName("Test assertTrue: Temperature below zero")
    void testAssertTrue() {
        thermometer.setCurrentTemp(-5);
        assertTrue(thermometer.isBelowZero(),
                "Temperature should be below zero");
    }

    @Test
    @DisplayName("Test assertFalse: Temperature above zero")
    void testAssertFalse() {
        thermometer.setCurrentTemp(5);
        assertFalse(thermometer.isBelowZero(),
                "Temperature should not be below zero");
    }

    @Test
    @DisplayName("Test assertNotNull: Thermometer instance")
    void testAssertNotNull() {
        assertNotNull(thermometer,
                "Thermometer instance should not be null");
    }

    @Test
    @DisplayName("Test assertNull: Create instance with null temperature")
    void testAssertNull() {
        Thermometer nullThermometer = Thermometer.createInstance(-10, 50);
        assertNull(nullThermometer.getCurrentTemp(),
                "Current temperature should be null in the created instance");
    }

    @Test
    @DisplayName("Exception when creating an invalid Thermometer")
    void exceptionWhenCreatingInvalidThermometer() {
        Throwable exception = assertThrows(IllegalArgumentException.class, () ->
                new Thermometer(10, 10));
        assertEquals("minTemp must be less than maxTemp.", exception.getMessage());
    }

    @Test
    @DisplayName("Exception when setting temperature out of range")
    void exceptionWhenSettingTemperatureOutOfRange() {
        Throwable exception = assertThrows(IllegalArgumentException.class, () ->
                thermometer.setCurrentTemp(100));
        assertEquals("Temperature out of range.", exception.getMessage());

        exception = assertThrows(IllegalArgumentException.class, () ->
                thermometer.setCurrentTemp(-20));
        assertEquals("Temperature out of range.", exception.getMessage());
    }

    @Test
    @DisplayName("Exception when adding degrees beyond maximum temperature")
    void exceptionWhenAddingDegreesBeyondMax() {
        thermometer.setCurrentTemp(45);
        Throwable exception = assertThrows(IllegalArgumentException.class, () ->
                thermometer.addDegrees(10));
        assertEquals("Temperature exceeds max limit.", exception.getMessage());
    }

    @Test
    @DisplayName("Exception when subtracting degrees below minimum temperature")
    void exceptionWhenSubtractingDegreesBelowMin() {
        thermometer.setCurrentTemp(-5);
        Throwable exception = assertThrows(IllegalArgumentException.class, () ->
                thermometer.subtractDegrees(10));
        assertEquals("Temperature falls below min limit.", exception.getMessage());
    }

    @Test
    @DisplayName("Exception when adding negative degrees")
    void exceptionWhenAddingNegativeDegrees() {
        Throwable exception = assertThrows(IllegalArgumentException.class, () ->
                thermometer.addDegrees(-5));
        assertEquals("Degrees must be positive.", exception.getMessage());
    }

    @Test
    @DisplayName("Exception when subtracting negative degrees")
    void exceptionWhenSubtractingNegativeDegrees() {
        Throwable exception = assertThrows(IllegalArgumentException.class, () ->
                thermometer.subtractDegrees(-5));
        assertEquals("Degrees must be positive.", exception.getMessage());
    }
}
