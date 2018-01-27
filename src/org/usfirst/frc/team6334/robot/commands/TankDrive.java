package org.usfirst.frc.team6334.robot.commands;

import org.usfirst.frc.team6334.robot.RobotMap;

import edu.wpi.first.wpilibj.Joystick;

/**
 *
 */
public class TankDrive extends CommandBase {

	double leftThrottle, rightThrottle;
	Joystick stick, mainStick, auxStick;

	public TankDrive() {
		super("TankDrive");
		requires(driveTrain);
	}

	// Called just before this Command runs the first time
	protected void initialize() {

	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {

		mainStick = oi.getMainStick();
		auxStick = oi.getAuxStick();
		// leftThrottle = auxStick.getX();
		// rightThrottle = mainStick.getX();

		stick = oi.getXboxStick();
		leftThrottle = stick.getRawAxis(RobotMap.xboxLeftYAxis);
		rightThrottle = stick.getRawAxis(RobotMap.xboxRightYAxis);

		if (stick.getRawButtonPressed(RobotMap.xboxXButton)) {
			driveTrain.changeBrakeMode(false);
		} else if (stick.getRawButton(RobotMap.xboxYButton)) {
			System.out.println(driveTrain.testCompressor());
		}

		if (stick.getRawButtonPressed(RobotMap.xboxRightBumper)) {
			driveTrain.setHighGear();
		} else if (stick.getRawButtonPressed(RobotMap.xboxLeftBumper)) {
			driveTrain.setLowGear();
		} else {
			driveTrain.driveWithController(rightThrottle, leftThrottle);
		}
		driveTrain.updateDash();
	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() {
		return false; // Returning false makes this the default command when there are not others.
	}

	// Called once after isFinished returns true
	protected void end() {
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
	}
}
