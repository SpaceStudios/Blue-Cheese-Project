package frc.robot.Subsystems.Drivetrain;

public interface DrivetrainIO {
    public static class DrivetrainIOInputs{
        public double leftOutputVolts = 0.0;
        public double rightOutputVolts = 0.0;

        public double leftVelocityMetersPerSecond = 0.0;
        public double rightVelocityMetersPerSecond = 0.0;
        
        public double leftPositionMeters = 0.0;
        public double rightPositionMeters = 0.0;

        public double[] leftCurrentAmps = new double[0];
        public double[] rightCurrentAmps = new double[0];

        public double[] leftCurrentTemp = new double[0];
        public double[] rightCurrentTemp = new double[0];
    }
    public abstract void updateInputs(DrivetrainIOInputs inputs);
    public abstract void setVolts(double left, double right);
}
