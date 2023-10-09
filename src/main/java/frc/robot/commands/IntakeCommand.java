package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.subsystems.ShooterMotors;
import frc.robot.subsystems.Spinner;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class IntakeCommand extends CommandBase {
	private final ShooterMotors m_shooterMotors;
	private final Spinner m_spinner;

	public IntakeCommand(ShooterMotors shooterMotors,
											 Spinner spinner) {
		m_shooterMotors = shooterMotors;
		m_spinner = spinner;
		addRequirements(m_shooterMotors, m_spinner);
	}

	// public IntakeCommand(String name) {
	// 	super(name);
	// 	requires(Robot.lifter);
	// }

	// public IntakeCommand(double timeout) {
	// 	super(timeout);
	// }

	// public IntakeCommand(String name, double timeout) {
	// 	super(name, timeout);
	// }

	 // Called when the command is initially scheduled.
	 @Override
	 public void initialize() {}
   
	 // Called every time the scheduler runs while the command is scheduled.
	 @Override
	 public void execute() {
		m_shooterMotors.Intake();
		m_spinner.On();
	}

 	// Returns true when the command should end.
 	@Override
 	public boolean isFinished() {
   		return false;
 	}

	// Called once the command ends or is interrupted.
	@Override
	public void end(boolean interrupted) {
		m_shooterMotors.Stop();
		m_spinner.Off();
	}

	// @Override
	// protected void interrupted() {
	// 	m_lifter.Stop();
	// 	SmartDashboard.putNumber("EncPos",m_lifter.lifterPos());
	// }

}
