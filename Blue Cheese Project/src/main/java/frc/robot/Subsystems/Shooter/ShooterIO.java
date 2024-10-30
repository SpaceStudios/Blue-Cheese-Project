// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Subsystems.Shooter;

/** Add your docs here. */
public interface ShooterIO {
    public static class ShooterData {
        public double ShooterVolts;
        public double ShooterAMPs;
    }

    public abstract void setVolts(double volts); 

}
