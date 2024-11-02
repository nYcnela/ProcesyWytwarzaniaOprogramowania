package Zadanie3_2_2;

public class TurnLeft implements FlightOperations {
    private double angle;

    public double getAngle(){
        return angle;
    }
    public void setAngle(double angle){
        this.angle=angle;
    }

    @Override
    public void operate(Plane plane) {
        plane.setDirection(plane.getDirection() + getAngle());
    }
}
