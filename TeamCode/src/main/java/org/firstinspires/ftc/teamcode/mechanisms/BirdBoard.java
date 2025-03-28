package org.firstinspires.ftc.teamcode.mechanisms;

import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class BirdBoard {
    private Servo servo1;
    private Servo servo2;

    public void init(HardwareMap hwMap) {
        servo1 = hwMap.get(Servo.class, "servo1");
        servo2 = hwMap.get(Servo.class, "servo2");
    }
    public void setServoPositionWing(double positionWing){
        servo1.setPosition(positionWing);
    }
    public void setServoPositionRotation(double positionRotation){
        servo2.setPosition(positionRotation);
    }
}
