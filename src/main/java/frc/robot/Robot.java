package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import frc.robot.components.Drivebase;
import frc.robot.components.Teleop;

public class Robot extends TimedRobot{
    public static enum Mode{
        DISABLED, TELEOP
    }

    private Mode mode = Mode.DISABLED;

    private Drivebase drivebase;

    private Teleop teleop;

    @Override
    public void robotInit(){
        teleop = new Teleop();

        drivebase = new Drivebase();
    }

    @Override
    public void robotPeriodic(){
    }

    @Override
    public void teleopInit(){
        mode = Mode.TELEOP;
    }

    @Override
    public void teleopPeriodic(){
        teleop.periodic(this);
    }

    @Override
    public void disabledInit(){
        mode = Mode.DISABLED;
    }

    public Mode getMode(){
        return mode;
    }

    public Teleop getTeleop(){
        return teleop;
    }
    
    public Drivebase getDrivebase(){
        return drivebase;
    }
}