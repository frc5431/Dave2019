package frc.robot.components;

import frc.robot.components.Drivebase;
import frc.robot.Constants;
import frc.robot.Robot;
import frc.robot.Titan;

public class Teleop{
    private Titan.Xbox driver;

    public Teleop(){
        driver = new Titan.Xbox(Constants.DRIVER_JOYSTICK_ID);
        driver.setDeadzone(Constants.DRIVER_JOYSTICK_DEADZONE);
    }

    public void periodic(final Robot robot){
        robot.getDrivebase().drive(-driver.getRawAxis(Titan.Xbox.Axis.LEFT_Y)/2, driver.getRawAxis(Titan.Xbox.Axis.RIGHT_Y)/2);
    }

    public Titan.Xbox getDriver(){
        return driver;
    }
}