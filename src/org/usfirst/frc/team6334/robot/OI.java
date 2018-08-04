/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/
 
package org.usfirst.frc.team6334.robot;
 
import org.usfirst.frc.team6334.robot.commands.*;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
 
/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
 
  private Joystick elevatorStick = new Joystick(RobotMap.elevatorStick);
  private Joystick climberStick = new Joystick(RobotMap.intakeStick);
  private Joystick arcadeStick = new Joystick(RobotMap.arcadeStickPort);
  private Joystick leftStick = new Joystick(RobotMap.leftStick);
  private Joystick rightStick = new Joystick(RobotMap.rightStick);
 
  // put button press events here
  public OI() {
	  SmartDashboard.putNumber("distance1", 0);
	  SmartDashboard.putNumber("distance2", 0);
	  SmartDashboard.putNumber("distance3", 0);
	  SmartDashboard.putNumber("angle1", 0);
	  SmartDashboard.putNumber("angle2", 0);
	  
	  JoystickButton autoLeft = new JoystickButton(elevatorStick, 8);
	  JoystickButton autoRight = new JoystickButton(elevatorStick, 9);
	  
	  //autoLeft.whenPressed(new autoThreeCubeTest(true)); 
	  //autoRight.whenPressed(new autoThreeCubeTest(false));
  }
 
 
  public Joystick getElevatorStick() {
    return elevatorStick;
  }
  
  public Joystick getClimberStick() {
	return climberStick;  
  }
  
  public Joystick getArcadeStick() {
	  return arcadeStick;
  }
  
  
  public Joystick getLeftStick() {
	  return leftStick;
  }
  
  public Joystick getRightStick() {
	  return rightStick;
  }
}