/**
 * UC6:
 * Use custom exception for validation.
 */
import java.util.Scanner;
public class FactoryRobotHazardAnalyzer {
    public static double calculateHazardRisk(double armPrecision, int workerDensity)
            throws RobotSafetyException {

        if (armPrecision <= 0) {
            throw new RobotSafetyException("Arm precision must be greater than zero.");
        }

        if (workerDensity < 0) {
            throw new RobotSafetyException("Worker density cannot be negative.");
        }

        return (workerDensity * 1.5) / armPrecision;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("Enter Arm Precision: ");
            double armPrecision = scanner.nextDouble();

            System.out.print("Enter Worker Density: ");
            int workerDensity = scanner.nextInt();

            double hazardScore = calculateHazardRisk(armPrecision, workerDensity);

            System.out.println("Hazard Risk Score: " + hazardScore);

        } catch (RobotSafetyException e) {

            System.out.println("Safety Error: " + e.getMessage());
        }

        scanner.close();
    }
}