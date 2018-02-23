package org.usfirst.frc.team6334.robot.subsystems;
 
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team6334.robot.RobotMap;
import org.usfirst.frc.team6334.robot.commands.IntakeDrive;
 
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
 
public class Intake extends Subsystem {

	WPI_TalonSRX right, left;
	DigitalInput irBeam;
	DoubleSolenoid intakeSolenoid;
	
	public Intake(){
		right = new WPI_TalonSRX(RobotMap.intakeRight);
		left = new WPI_TalonSRX(RobotMap.intakeLeft);
		
		irBeam = new DigitalInput(RobotMap.irBeam);
		
		intakeSolenoid = new DoubleSolenoid(RobotMap.intakeState1, RobotMap.intakeState2);
		
		left.setInverted(true); //Inverted motor subject to change
	}
	
	public void setIntakePower(double throttle) {
		right.set(throttle);
		left.set(throttle);
	}
	
	public void openIntake() {
    	intakeSolenoid.set(DoubleSolenoid.Value.kReverse);
    }
    
    public void closeIntake() {
    	intakeSolenoid.set(DoubleSolenoid.Value.kForward);
    }
    
    public boolean hasCube() {
    	return !irBeam.get();
    }
    
    public boolean getRawIR() {
    	return irBeam.get();
    }
    
    public void initDefaultCommand() {
        setDefaultCommand(new IntakeDrive());
    }
}
 
 