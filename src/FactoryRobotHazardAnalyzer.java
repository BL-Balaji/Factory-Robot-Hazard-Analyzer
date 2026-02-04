import java.util.Scanner;

/**
 * UC4:
 * Validate inputs using conditional statements.
 */
public class FactoryRobotHazardAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Arm Precision: ");
        double armPrecision = scanner.nextDouble();

        System.out.print("Enter Worker Density: ");
        int workerDensity = scanner.nextInt();

        // Validation
        if (armPrecision <= 0) {
            System.out.println("Error: Arm precision must be greater than zero.");
        }
        else if (workerDensity < 0) {
            System.out.println("Error: Worker density cannot be negative.");
        }
        else {

            double hazardScore = (workerDensity * 1.5) / armPrecision;

            System.out.println("Hazard Risk Score: " + hazardScore);
        }

        scanner.close();
    }
}