package Zadanie3_2_2;

import java.security.InvalidParameterException;

public class Plane {

    private double direction;

    public double getDirection() {
        return direction;
    }

    public void setDirection(double direction) {
        this.direction = direction;
    }

    public void fly(FlightOperations operation) {
        if (operation == null) {
            throw new InvalidParameterException("Cannot perform operation");
        }
        operation.operate(this);
    }
}
