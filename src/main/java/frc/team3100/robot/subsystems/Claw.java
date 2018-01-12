package frc.team3100.robot.subsystems;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.team3100.robot.RobotMap;


public class Claw extends Subsystem {

    // Defining objects from RobotMap that control the claw
    private static SpeedController clawMotorLeft = RobotMap.clawMotorLeft;
    private static SpeedController clawMotorRight = RobotMap.clawMotorRight;
    private static Solenoid clawGrabberL = RobotMap.clawGrabberL;
    private static Solenoid clawGrabberR = RobotMap.clawGrabberR;
    private static Solenoid clawRotate = RobotMap.clawRotate;

    public void initDefaultCommand() {

    }

    // Uses pneumatics to open/close the claw. Can be used to grab boxes from different orientations.
    public void close() {
        clawGrabberL.set(true);
        clawGrabberR.set(true);
    }

    public void open() {
        clawGrabberL.set(false);
        clawGrabberR.set(false);
    }

    // Changes the speed of the wheels to intake or output the power cube.
    public void collect() {
        clawMotorLeft.set(1);
        clawMotorRight.set(1);
    }

    public void score() {
        clawMotorLeft.set(-1);
        clawMotorRight.set(-1);
    }

    // To control the rotaton of the claw at the beginning of the match.
    public void rotUp() {
        clawRotate.set(false);
    }

    public void rotDown() {
        clawRotate.set(true);
    }

}