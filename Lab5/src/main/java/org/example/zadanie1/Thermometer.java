package org.example.zadanie1;

public class Thermometer {
    int minTemp;
    int maxTemp;
    Integer currentTemp;

    Thermometer(int minTemp, int maxTemp) {
        if (minTemp >= maxTemp) {
            throw new IllegalArgumentException("minTemp must be less than maxTemp.");
        }
        this.minTemp = minTemp;
        this.maxTemp = maxTemp;
    }

    public static Thermometer createInstance(int minTemp, int maxTemp) {
        Thermometer thermometer = new Thermometer(minTemp, maxTemp);
        thermometer.currentTemp = null;
        return thermometer;
    }

    public Integer getCurrentTemp() {
        return currentTemp;
    }

    public void setCurrentTemp(int currentTemp) {
        if (currentTemp < minTemp || currentTemp > maxTemp) {
            throw new IllegalArgumentException("Temperature out of range.");
        }
        this.currentTemp = currentTemp;
    }

    public int addDegrees(int degrees) {
        if (degrees < 0) {
            throw new IllegalArgumentException("Degrees must be positive.");
        }
        currentTemp += degrees;
        if (currentTemp > maxTemp) {
            throw new IllegalArgumentException("Temperature exceeds max limit.");
        }
        return currentTemp;
    }

    public int subtractDegrees(int degrees) {
        if (degrees < 0) {
            throw new IllegalArgumentException("Degrees must be positive.");
        }
        currentTemp -= degrees;
        if (currentTemp < minTemp) {
            throw new IllegalArgumentException("Temperature falls below min limit.");
        }
        return currentTemp;
    }

    public boolean isBelowZero() {
        return currentTemp < 0;
    }
}

