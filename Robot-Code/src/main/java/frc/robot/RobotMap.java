/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;


/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	//Drive Train
		//Left
			public static int leftDriveMasterPort = 5;
			public static int leftDriveSlave0Port = 6;
			public static int leftDriveSlave1Port = 7;
		//Right
			public static int rightDriveMasterPort = 5;
			public static int rightDriveSlave0Port = 5;
			public static int rightDriveSlave1Port = 5;

	//Controllers
		//USB
			//Driver Controller
				public static int driverController = 1;
				public static int operatorController = 5;
			//Operator Controller

	//Elevator

	//Intake

	//Pneumatics
		//Solenoids
			public static int leftSolenoidPort = 0;
			public static int rightSolenoidPort = 1;
}
