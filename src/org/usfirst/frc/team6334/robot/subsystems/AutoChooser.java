package org.usfirst.frc.team6334.robot.subsystems;

import org.usfirst.frc.team6334.robot.RobotMap;
import org.usfirst.frc.team6334.robot.commands.*;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class AutoChooser extends Subsystem {

	String gameData = "";
	char currentSide = 'C';
	boolean goForSwitch = true;
	boolean backAlley = true;
	Command choice;
	DigitalInput leftDIO, rightDIO, switchDIO;

    public AutoChooser() {
    	choice = null;
    	
    	leftDIO = new DigitalInput(RobotMap.leftDIO);
    	rightDIO = new DigitalInput(RobotMap.rightDIO);
    	//centerDIO = new DigitalInput(RobotMap.centerDIO);
    	switchDIO = new DigitalInput(RobotMap.switchDIO);
    	//scaleDIO = new DigitalInput(RobotMap.scaleDIO);
    }
    
    public void grabGameData() {
    	
    	if(gameData.equals("")) {
    		System.out.println("rip");
    		gameData = DriverStation.getInstance().getGameSpecificMessage();
    		grabGameData();
    	} else System.out.println("Yay!");
    	
    	/*
    	if(!leftDIO.get()) {
    		currentSide = 'L';
    		System.out.println("Left side auto...");
    	} else if (!rightDIO.get()) {
    		currentSide = 'R';
    		System.out.println("Right side auto...");
    	} else if (!rightDIO.get() && !leftDIO.get()) {
    		currentSide = 'C';
    		System.out.println("Center auto...");
    	}
    	
    	if(!switchDIO.get()) {
    		goForSwitch = true;
    		System.out.println("Switch is preference!");
    	} else {
    		goForSwitch = false;
    		System.out.println("Scale is preference!");
    	} */
    	/*else { if (!scaleDIO.get()){
    		goForSwitch = false;
    		System.out.println("Going for scale as preference!");
    	}*/
    	System.out.println(currentSide);
    	System.out.println(goForSwitch);
    	System.out.println(gameData);
    }
    
    public void chooseAuto() {
    	grabGameData();
    	
    	System.out.println("gamedata grabbed");
    	if(goForSwitch) {
    		System.out.println("Going for switch");
    		if(backAlley) {
		    	if(currentSide == 'C') {
		    		System.out.println("Center auto");
		    		switch (gameData) {
		    			case "LLL": choice = new autoCenterToLeftSwitch();
		    				break;
		    				
		    			case "LRL": choice = new autoCenterToLeftSwitch();
		    				break;
		    				
		    			case "RLR": choice = new autoCenterToRightSwitch();
		    				break;
		    				
		    			case "RRR": choice = new autoCenterToRightSwitch();
		    		}
		    	} else if (currentSide == 'L') {
		    		System.out.println("Left auto");
		    		switch (gameData) {
						case "LLL": choice = new autoLeftToLeftSwitch();
							break;
							
						case "LRL": choice = new autoLeftToLeftSwitch();
							break;
							
						case "RLR": choice = new autoLeftToRightSwitch();
							break;
							
						case "RRR": choice = new autoLeftToRightSwitch();
							break;
		    		}
		    	} else if (currentSide == 'R') {
		    		System.out.println("Right auto");
		    		switch (gameData) {
		    		case "RRR": choice = new autoRightToRightSwitch();
						break;
						
					case "RLR": choice = new autoRightToRightSwitch();
						break;
						
					case "LRL": choice = new autoRightToLeftSwitch();
						break;
						
					case "LLL": choice = new autoRightToLeftSwitch();
						break;
					}
		    	} 
    		} else {
	    		if(currentSide == 'C') {
		    		System.out.println("Center auto");
		    		switch (gameData) {
		    			case "LLL": choice = new autoCenterToLeftSwitch();
		    				break;
		    				
		    			case "LRL": choice = new autoCenterToLeftSwitch();
		    				break;
		    				
		    			case "RLR": choice = new autoCenterToRightSwitch();
		    				break;
		    				
		    			case "RRR": choice = new autoCenterToRightSwitch();
		    		}
		    	} else if (currentSide == 'L') {
		    		System.out.println("Left auto");
		    		switch (gameData) {
						case "LLL": choice = new autoLeftToLeftSwitch();
							break;
							
						case "LRL": choice = new autoLeftToLeftSwitch();
							break;
							
						case "RLR": choice = new autoMoveForward();
							break;
							
						case "RRR": choice = new autoMoveForward();
							break;
		    		}
		    	} else if (currentSide == 'R') {
		    		System.out.println("Right auto");
		    		switch (gameData) {
		    		case "RRR": choice = new autoRightToRightSwitch();
						break;
						
					case "RLR": choice = new autoRightToRightSwitch();
						break;
						
					case "LRL": choice = new autoMoveForward();
						break;
						
					case "LLL": choice = new autoMoveForward();
						break;
					}
		    	}
	    	}
    	} else {
    		System.out.println("Going for scale");
    		if(backAlley) {
    			if(currentSide == 'C') {
        			System.out.println("Center auto");
            		switch (gameData) {
            			case "LLL": choice = new autoCenterToLeftSwitch();
            				break;
            				
            			case "LRL": choice = new autoCenterToLeftSwitch();
            				break;
            				
            			case "RLR": choice = new autoCenterToRightSwitch();
            				break;
            				
            			case "RRR": choice = new autoCenterToRightSwitch();
            		}
            	} else if (currentSide == 'L') {
            		System.out.println("Left auto");
            		switch (gameData) {
        				case "LLL": choice = new autoLeftToScaleSameSide();
        					break;
        					
        				case "LRL": choice = new autoLeftToRightScale();
        					break;
        					
        				case "RLR": choice = new autoLeftToScale();
        					break;
        					
        				case "RRR": choice = new autoLeftToRightScale();
        					break;
            		}
            	} else if (currentSide == 'R') {
            		System.out.println("Right auto");
            		switch (gameData) {
            		case "RRR": choice = new autoRightToScaleSameSide();
        				break;
        				
        			case "RLR": choice = new autoRightToLeftScale();
        				break;
        				
        			case "LRL": choice = new autoRightToScale();
        				break;
        				
        			case "LLL": choice = new autoRightToLeftScale();
        				break;
        			}
            	}
    		} else {
    			if(currentSide == 'C') {
        			System.out.println("Center auto");
            		switch (gameData) {
            			case "LLL": choice = new autoCenterToLeftSwitch();
            				break;
            				
            			case "LRL": choice = new autoCenterToLeftSwitch();
            				break;
            				
            			case "RLR": choice = new autoCenterToRightSwitch();
            				break;
            				
            			case "RRR": choice = new autoCenterToRightSwitch();
            		}
            	} else if (currentSide == 'L') {
            		System.out.println("Left auto");
            		switch (gameData) {
        				case "LLL": choice = new autoLeftToScaleSameSide();
        					break;
        					
        				case "LRL": choice = new autoLeftToLeftSwitch();
        					break;
        					
        				case "RLR": choice = new autoLeftToScale();
        					break;
        					
        				case "RRR": choice = new autoMoveForward();
        					break;
            		}
            	} else if (currentSide == 'R') {
            		System.out.println("Right auto");
            		switch (gameData) {
            		case "RRR": choice = new autoRightToScaleSameSide();
        				break;
        				
        			case "RLR": choice = new autoRightToRightSwitch();
        				break;
        				
        			case "LRL": choice = new autoRightToScale();
        				break;
        				
        			case "LLL": choice = new autoMoveForward();
        				break;
        			}
            	}
    		}
    	}
    	
    	if(choice != null) { 
    		choice.start();
    		System.out.println("auto chosen and started");
    	} else {
    		System.out.println("Null auto!!!");
    		choice = new autoMoveForward();
    		choice.start();
    	}
    }
    
    public void testAuto() {
    	Command testThisAuto = new moveDistanceX(100, 0.4);
    	testThisAuto.start();
    }
    
    public void cancelAuto() {
    	if(choice != null) choice.cancel();
    }
    
    public void initDefaultCommand() {
    	//no default command
    }
}

