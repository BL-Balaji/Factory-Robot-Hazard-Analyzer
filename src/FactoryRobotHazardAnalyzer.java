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

        // Accept inputs
        System.out.print("Enter Arm Precision: ");
        double armPrecision = scanner.nextDouble();

        System.out.print("Enter Worker Density: ");
        int workerDensity = scanner.nextInt();

        scanner.nextLine(); // consume newline

        System.out.print("Enter Machinery State: ");
        String machineryState = scanner.nextLine();

        // Echo inputs
        System.out.println("\n--- Inputs Received ---");
        System.out.println("Arm Precision: " + armPrecision);
        System.out.println("Worker Density: " + workerDensity);
        System.out.println("Machinery State: " + machineryState);

        scanner.close();
    }
}