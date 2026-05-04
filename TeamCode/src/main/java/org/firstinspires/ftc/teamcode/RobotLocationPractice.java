package org.firstinspires.ftc.teamcode;

public class RobotLocationPractice {
    double angle;

    // constructor method - allows people to grab it in other classes
    public RobotLocationPractice(double angle) {
        this.angle = angle;
    }

    public double getHeading() {
        // this method normalizes robot heading
        double angle = this.angle;
        while (angle > 180) {
            angle -= 360;
        }
        while (angle <= -180) {
            angle += 360
        }
        return angle;
    }
}
