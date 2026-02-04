import java.util.Scanner;

/*
 * UC1: Display Static Hazard Message
 *
 * Purpose:
 * - This is the entry point of the application.
 * - It displays a static message indicating the purpose of the system.
 *
 * Concepts Used:
 * - Class declaration
 * - main() method
 * - Print statement
 */
public class FactoryRobotHazardAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Arm Precision: ");
        double armPrecision = scanner.nextDouble();

        System.out.print("Enter Worker Density: ");
        int workerDensity = scanner.nextInt();

        // Hazard calculation
        double hazardScore = (workerDensity * 1.5) / armPrecision;

        System.out.println("Hazard Risk Score: " + hazardScore);

        scanner.close();
    }
}