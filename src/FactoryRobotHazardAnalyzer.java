/**
 * UC5:
 * Move calculation + validation into a method.
 */
import java.util.Scanner;
public class FactoryRobotHazardAnalyzer {
    public static double calculateHazardRisk(double armPrecision, int workerDensity) {

        if (armPrecision <= 0 || workerDensity < 0) {
            return -1; // indicates invalid input
        }

        return (workerDensity * 1.5) / armPrecision;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Arm Precision: ");
        double armPrecision = scanner.nextDouble();

        System.out.print("Enter Worker Density: ");
        int workerDensity = scanner.nextInt();

        double result = calculateHazardRisk(armPrecision, workerDensity);

        if (result == -1) {
            System.out.println("Invalid inputs!");
        } else {
            System.out.println("Hazard Risk Score: " + result);
        }

        scanner.close();
    }
}