/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/
 
package org.usfirst.frc.team6334.robot;
 
import edu.wpi.first.wpilibj.Joystick;
 
/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
 
  private Joystick elevatorStick = new Joystick(RobotMap.elevatorStick);
  private Joystick intakeStick = new Joystick(RobotMap.intakeStick);
  private Joystick arcadeStick = new Joystick(RobotMap.arcadeStickPort);
 
  // put button press events here
  public OI() {
 
  }
 
 
  public Joystick getElevatorStick() {
    return elevatorStick;
  }
  
  public Joystick getIntakeStick() {
	return intakeStick;  
  }
  public Joystick getArcadeStick() {
	  return arcadeStick;
  }
  }