package org.firstinspires.ftc.teamcode.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.mechanisms.BirdBoard;

@TeleOp
public class BirdMovement extends OpMode {
    BirdBoard board = new BirdBoard();
    @Override
    public void init() {
        board.init(hardwareMap);
    }

    @Override
    public void loop() {
        if(gamepad1.a){
            board.setServoPositionWing(1.0);
        }
        else if (gamepad1.b) {
            board.setServoPositionWing(0.0);
        }
        else{
            board.setServoPositionWing(0.5);
        }
        if(gamepad1.x){
            board.setServoPositionRotation(1.0);
        }
        else if (gamepad1.y) {
            board.setServoPositionRotation(0.0);
        }
        else{
            board.setServoPositionRotation(0.5);
        }
    }
}
