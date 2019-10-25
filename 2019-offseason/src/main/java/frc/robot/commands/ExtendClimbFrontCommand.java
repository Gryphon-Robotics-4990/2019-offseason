package frc.robot.commands;

import frc.robot.subsystems.ClimbSubsystem;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class ExtendClimbFrontCommand extends CommandBase {

    private final ClimbSubsystem m_climb;

    public ExtendClimbFrontCommand(ClimbSubsystem climb) {
        m_climb = climb;
        addRequirements(climb);
    }
}
