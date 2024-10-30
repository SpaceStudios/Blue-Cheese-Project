package frc.robot.Subsystems.Shooter;

public interface ShooterIO {
    public static class ShooterData {
        public double shooterVelocity = 0.0;
        public double feederVelocity = 0.0;

        public double shooterTemp = 0.0;
        public double feederTemp = 0.0;
        
        public double shooterAmps = 0.0;
        public double feeederAmps = 0.0;

        public double shooterOutput = 0.0;
        public double feederOutput = 0.0;
    }

public abstract void setFeederVolts(double volts);
public abstract void setShooterVolts(double volts);
public abstract void getData(ShooterData data);
}
