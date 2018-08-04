/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team6334.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	
	public final static char currentSide = 'L';
	
	// Controller Ports
	public final static int intakeStick = 2;
	public final static int elevatorStick = 2;
	public final static int arcadeStickPort = 0;
	public final static int leftStick = 0;
	public final static int rightStick = 1;
	
	//Joystick Buttons (Hopefully soon to be categorized for each joystick)
	public final static int shiftDown = 9;
	public final static int shiftUp = 7;
	public final static int coastMode = 5;
	public final static int resetEncoders = 11;				//remove?
	public final static int changeTurbo = 6;				//remove?
	public final static int openIntake = 11;
	public final static int closeIntake = 10;
	public final static int changeCameraSource = 6;			//Change
	public final static int intakeIn = 3;
	public final static int intakeOut = 4;
	public final static int changeIntakeSolenoid = 1;
	public final static int hookArm = 1;
	public final static int changeLimeLightCam = 3;
	public final static int changeLimeLightLED = 3;
	public final static int liftOverride = 2;				//remove?
	public final static int endLiftTask = 8;				//Change
	public final static int endIntakeTask = 8;				//Change
	public final static int endClimberTask = 8;				//Change
	public final static int startLiftTask = 9;				//Change
	public final static int startIntakeTask = 9;			//Change
	public final static int startClimberTask = 9;			//Change
	public final static int ejectBox = 1;
	public final static int climbBackDrive1 = 4;
	public final static int climbBackDrive2 = 11;
	public final static int hookArmSlowMode = 1;
	public final static int hookArmFastMode = 2;

	// TalonSRX ID's and values (CAN range is 1 to 62 since PCM uses ID 0)
	public final static int RightDrive1 = 9;
	public final static int RightDrive2 = 8;
	public final static int LeftDrive1 = 1;
	public final static int LeftDrive2 = 2;
	public final static int climberLift1 = 56;
	public final static int climberLift2 = 57;
	public final static int hookPivot = 58;
	public final static int liftMotor2 =  59;
	public final static int liftMotor =  60;
	public final static int intakeRight =  61;
	public final static int intakeLeft =  62;

	// Encoders
	public final static int encLeftIn = 6;
	public final static int encLeftOut = 7;
	public final static int encRightIn = 8;
	public final static int encRightOut = 9;
	public final static int liftEncIn = 0;
	public final static int liftEncOut = 1;
	public final static int driveEncTicks = 360/3;
	public final static double automaticShiftValue = 3.5;

	// Solenoids (D I/O slots)
	public final static int gearChange1 = 0;
	public final static int gearChange2 = 1;
	public final static int intakeState1 = 2;
	public final static int intakeState2 = 3;

	//Drive Train constants
	public final static double wheelBase = 2.115;
	public final static double middleOfWheelbase = 19.25;
	public final static double wheelDiameter = 6;
	public final static double deadzone = 0;
	public final static double throttleModifier = 0.25;
	public final static double gyro_kP = 0.03;
	public final static double gyro_kI = 0.1;
	public final static double gyro_kD = 0;
	public final static double highGearRate = 7;
	public final static double lowGearRate = 1;
	public final static double startUpThrottle = 0.25;
	
	//Lift Constants
	public final static int liftPosMin = 0;
	public final static int liftPosMax = 25000;
	public final static int lift_kP = 0;
	public final static int lift_kI= 0;
	public final static int liftUpperBound = 25500;
	public final static int liftLowerBound = 0;
	public final static int switchHeight = 25500;
	public final static int scaleHeight = 23000;
	public final static int resetHeight = 3000;
	
	//Climb Constants
	public static final int climberButton = 6; // on intake stick
	
	//Camera Constants
	public static final int frontFacingCamera = 0;
	
	//DIO Constants
	public static final int leftDIO = 0;
	public static final int rightDIO = 1;
	//public static final int centerDIO = 3;
	public static final int switchDIO = 3;
	//public static final int scaleDIO = 5;
	public static final int irBeam = 2;
	

	// Xbox Axis
	public final static int xboxLeftXAxis = 0;
	public final static int xboxLeftYAxis = 1;
	public final static int xboxLeftTrigger = 2; // Joystick buttons must be mapped out.
	public final static int xboxRightTrigger = 3;
	public final static int xboxRightXAxis = 4;
	public final static int xboxRightYAxis = 5;
	
	// Xbox Buttons
	public final static int xboxAButton = 1;
	public final static int xboxBButton = 2;
	public final static int xboxXButton = 3;
	public final static int xboxYButton = 4;
	public final static int xboxLeftBumper = 5;
	public final static int xboxRightBumper = 6;
	public final static int xboxViewButton = 7;
	public final static int xboxMenuButton = 8;
	public final static int xboxLeftStickButton = 9;
	public final static int xboxRightStickButton = 10;
	
	// Limelight
	public final static double L_KpX = 0.07;
	public final static double L_KpY = 0.05;
	public final static double L_min_Kp = 0.05;
	public final static int ledOn = 0;
	public final static int ledOff = 1;
	public final static int ledBlink = 2;
	public final static int camVisionProccesor = 0;
	public final static int camDriver = 1;
	public final static int pipeline0 = 0;
	public final static int pipeline1 = 1;
	public final static int pipeline2 = 2;
	public final static int pipeline3 = 3;
	public final static int pipeline4 = 4;
	public final static int pipeline5 = 5;
	public final static int pipeline6 = 6;
	public final static int pipeline7 = 7;
	public final static int pipeline8 = 8;
	public final static int pipeline9 = 9;
}
