/**
 * UC8:
 * Custom Exception class used for handling
 * robot safety violations.
 *
 * Demonstrates:
 * ✔ Exception Inheritance
 * ✔ Reusability
 */
class RobotSafetyException extends Exception {

    public RobotSafetyException(String message) {
        super(message);
    }
}

