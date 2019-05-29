/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * This houses all the raw code for the elevator, It Imports the motor(s) and makes
 * a function to control the elevator *YOU CAN ONLY CONTROL THE MOTOR(S) THROUGH THIS
 * FUNCTION* [elvatorSpeed(double speed)]
 * It then tells the motor(s) to run on %output at that speed.
 */
public class ElevatorSubsystem extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  @Override
  public void initDefaultCommand() {
	// Set the default command for a subsystem here.
	// setDefaultCommand(new MySpecialCommand());
  }
}
