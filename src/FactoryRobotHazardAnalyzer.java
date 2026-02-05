/**
 * UC7 — Machinery State Risk Mapping
 */
import java.util.Scanner;
public class FactoryRobotHazardAnalyzer {
    public static double getMachineryRisk(String state)
            throws RobotSafetyException {

           switch (state) {
               case "Worn": return 1.2;
               case "Faulty": return 1.5;
               case "Critical": return 2.0;
               default:
                throw new RobotSafetyException(
                        "Unsupported machinery state!");
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("Enter Arm Precision: ");
            double armPrecision = scanner.nextDouble();

            System.out.print("Enter Worker Density: ");
            int workerDensity = scanner.nextInt();

            scanner.nextLine();

            System.out.print("Enter Machinery State: ");
            String state = scanner.nextLine();

            double riskFactor = getMachineryRisk(state);

            double hazardScore =
                    (workerDensity * riskFactor) / armPrecision;

            System.out.println("Hazard Risk Score: " + hazardScore);

        } catch (RobotSafetyException e) {

            System.out.println("Safety Error: " + e.getMessage());
        }

        scanner.close();
    }
}