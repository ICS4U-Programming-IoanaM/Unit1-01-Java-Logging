import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * This program calculates how many logs a
 * truck can hold based on the size of the log.
 *
 * @author Ioana Marinescu
 * @version 1.0
 * @since 2024-02-25
 */

public final class Logging {
  /**
   * Private constructor to prevent instantiation of this utility class.
   */
  private Logging() {
  }

  /**
   * The main method prints a stylish greeting message.
   *
   * @param args Command-line arguments (not used in this program)
   */
  public static void main(final String[] args) {
    // gets user input (pt.1)
    final Scanner scanner = new Scanner(System.in);
    System.out.println("What size are your logs? (0.25m, 0.5m, or 1m)");
    final float logSize;

    try {
      // gets user input (pt.2)
      logSize = scanner.nextFloat();

      // checks if user entered one of the three options given to the user
      if (logSize != 0.25 && logSize != 0.5 && logSize != 1) {
        // user did not enter the correct input
        System.out.println("Invalid input, please enter one of the three options.");
      } else {
        // calculates how many logs the truck can hold
        int logsOnTruck = (int) (1100 / (20 * logSize));
        // displays the amount of logs the truck can hold
        System.out.println("You can load " + logsOnTruck + " logs on the truck.");
      }

      // user did not enter in a float input
    } catch (InputMismatchException error) {
      System.out.println("Invalid input, please enter one of the three options.");
    }

    // closes scanner
    scanner.close();
  }
}
