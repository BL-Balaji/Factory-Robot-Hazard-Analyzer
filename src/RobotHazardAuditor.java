/**
 * UC8:
 * This class handles ALL business logic.
 *
 * OOPS Concepts:
 * ✔ Encapsulation – Logic hidden inside class
 * ✔ Single Responsibility – Only hazard auditing
 * ✔ Extensibility – Easy to add new machinery states
 */
public class RobotHazardAuditor {

    /**
     * Public method used by main().
     * Acts as an abstraction layer.
     */
    public double calculateHazardRisk(double armPrecision,
                                      int workerDensity,
                                      String machineryState)
            throws RobotSafetyException {

        // Step 1: Validate inputs
        validateInputs(armPrecision, workerDensity, machineryState);

        // Step 2: Get machinery risk factor
        double machineryRisk = mapMachineryRisk(machineryState);

        /**
         * Hazard Formula:
         * Higher worker density + risky machinery increases hazard.
         * Higher precision reduces hazard.
         */
        return (workerDensity * machineryRisk) / armPrecision;
    }

    /**
     * Validation method.
     * Private → Hidden from user (Encapsulation)
     */
    private void validateInputs(double armPrecision,
                                int workerDensity,
                                String machineryState)
            throws RobotSafetyException {

        if (armPrecision <= 0) {
            throw new RobotSafetyException(
                    "Arm precision must be greater than zero.");
        }

        if (workerDensity < 0) {
            throw new RobotSafetyException(
                    "Worker density cannot be negative.");
        }

        if (machineryState == null || machineryState.isBlank()) {
            throw new RobotSafetyException(
                    "Machinery state cannot be empty.");
        }
    }

    /**
     * Machinery Risk Mapping
     *
     * EXTENSIBLE:
     * Just add another case to support new machinery.
     */
    private double mapMachineryRisk(String state)
            throws RobotSafetyException {

        switch (state) {

            case "Worn":
                return 1.2;

            case "Faulty":
                return 1.5;

            case "Critical":
                return 2.0;

            default:
                throw new RobotSafetyException(
                        "Unsupported machinery state! Allowed: Worn, Faulty, Critical");
        }
    }
}

