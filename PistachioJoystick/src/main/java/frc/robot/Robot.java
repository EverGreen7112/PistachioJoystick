/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.TimedRobot;
import frc.robot.RobotMap.JoystickPorts;
import frc.robot.RobotMap.MotorPorts;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the TimedRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the build.gradle file in the
 * project.
 */
public class Robot extends TimedRobot {
  /**
   * This function is run when the robot is first started up and should be used
   * for any initialization code.
   */
  @Override
  public void robotInit() {
    Joystick rightJS = new Joystick(JoystickPorts.rightChasisJS);
    Joystick leftJS = new Joystick(JoystickPorts.leftChassisJS);

    VictorSPX chassisRightBack = new VictorSPX(MotorPorts.chassisRightBack);
    TalonSRX chassisRightMiddle = new TalonSRX(MotorPorts.chassisRightMiddle);
    VictorSPX chassisRightFront = new VictorSPX(MotorPorts.chassisRightFront);
    VictorSPX chassisLeftBack = new VictorSPX(MotorPorts.chassisLeftBack);
    TalonSRX chassisLeftMiddle = new TalonSRX(MotorPorts.chassisLeftMiddle);
    VictorSPX chassisLeftFront = new VictorSPX(MotorPorts.chassisLeftFront);
  }

  @Override
  public void autonomousInit() {

  }

  @Override
  public void autonomousPeriodic() {

  }

  @Override
  public void teleopInit() {

  }

  @Override
  public void teleopPeriodic() {

  }

  @Override
  public void testInit() {

  }

  @Override
  public void testPeriodic() {
    
  }
}
