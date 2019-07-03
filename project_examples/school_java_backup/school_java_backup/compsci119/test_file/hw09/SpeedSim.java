import java.io.PrintStream;

public class SpeedSim
{
  public static void main(String[] paramArrayOfString)
  {
    System.out.println("---------------------------------");
    System.out.println("  Speedometer Simulation System");
    System.out.println("---------------------------------");
    System.out.println();

    System.out.println("<< Testing with 32 axle mounted magnets and a tire diameter of 16 inches >>");
    System.out.println();

    double d1 = 16.0D;
    double d2 = 2.0D * d1 * 3.141592653589793D;
    int i = 32;

    simulateSpeed(55.0D, i, d2);
    simulateSpeed(40.0D, i, d2);
    simulateSpeed(22.5D, i, d2);

    System.out.println();
    System.out.println();
    System.out.println("<< Testing with 16 axle mounted magnets and a tire diameter of 17.5 inches >>");
    System.out.println();

    d1 = 17.5D;
    d2 = 2.0D * d1 * 3.141592653589793D;
    i = 16;

    simulateSpeed(55.0D, i, d2);
    simulateSpeed(40.0D, i, d2);
    simulateSpeed(22.5D, i, d2);
  }

  public static void simulateSpeed(double paramDouble1, int paramInt, double paramDouble2)
  {
    double d1 = paramDouble1 * 63360.0D / 3600.0D;

    double d2 = d1 / paramDouble2;
    double d3 = d2 * paramInt;

    Speedometer localSpeedometer = new Speedometer();
    localSpeedometer.setTireCircumference(paramDouble2);
    localSpeedometer.setPulsesPerRotation(paramInt);

    for (int i = 0; i < d3 - 1.0D; i++)
      localSpeedometer.pulse();
    localSpeedometer.clock();
    double d4 = localSpeedometer.getSpeed();

    for (int j = 0; j < d3; j++)
      localSpeedometer.pulse();
    localSpeedometer.clock();
    double d5 = localSpeedometer.getSpeed();

    double d6 = d5 - d4;

    System.out.printf("Simulating %.2f mph\n", new Object[] { Double.valueOf(paramDouble1) });

    System.out.printf("    Speedometer calculated %.2f mph\n", new Object[] { Double.valueOf(d5) });
    System.out.println();
  }
}
