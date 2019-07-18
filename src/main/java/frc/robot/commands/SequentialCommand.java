/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;
import frc.robot.commands.DoubleRelease;
import frc.robot.commands.DoubleShift;
import frc.robot.commands.SingleRelease;
import frc.robot.commands.SingleShift1;

import edu.wpi.first.wpilibj.command.CommandGroup;
//import frc.robot.Robot;
import edu.wpi.first.wpilibj.command.WaitCommand;


public class SequentialCommand extends CommandGroup {
  public SequentialCommand() {
    addSequential(new DoubleShift());
    addSequential(new WaitCommand(1));
    addSequential(new SingleShift1());
    addSequential(new WaitCommand(2));
    addSequential(new DoubleRelease());
    addSequential(new SingleRelease());
    // Use requires() here to declare subsystem dependencies
    //requires(Robot.m_subsystem);
  }
/*
  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    System.out.println("initialized");
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
*/
}
