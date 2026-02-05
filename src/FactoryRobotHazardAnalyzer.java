/**
 * UC8: Fully Modular Hazard Analyzer
 *
 * Flow:
 * 1. Collect inputs
 * 2. Delegate logic to RobotHazardAuditor
 * 3. Handle exceptions
 * 4. Display result
 *
 * Demonstrates:
 * ✔ Abstraction
 * ✔ Modularity
 */
import java.util.Scanner;
public class FactoryRobotHazardAnalyzer {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("===== Factory Robot Hazard Analyzer =====");

        try {

            // 1️⃣ Collect Inputs
            System.out.print("Enter Arm Precision: ");
            double armPrecision = scanner.nextDouble();

            System.out.print("Enter Worker Density: ");
            int workerDensity = scanner.nextInt();
            scanner.nextLine(); // consume newline

            System.out.print("Enter Machinery State (Worn/Faulty/Critical): ");
            String machineryState = scanner.nextLine();

            // 2️⃣ Delegate business logic
            RobotHazardAuditor auditor = new RobotHazardAuditor();

            double hazardScore = auditor.calculateHazardRisk(
                    armPrecision,
                    workerDensity,
                    machineryState
            );

            // 3️⃣ Display Result
            System.out.println("\n✅ Hazard Risk Score: " + hazardScore);

        }
        catch (RobotSafetyException e) {

            // Exception-based control flow
            System.out.println("\n❌ Safety Error: " + e.getMessage());
        }
        finally {
            scanner.close();
        }
    }
}
