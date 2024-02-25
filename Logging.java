import java.util.*;

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
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("What size are your logs? (0.25m, 0.5m, or 1m)");
    float logSize;

    try {
      logSize = scanner.nextFloat();

      if (logSize != 0.25 && logSize != 0.5 && logSize != 1) {
        System.out.println("Invalid input, please enter one of the three options.");
        return;
      }

      int logsOnTruck = (int) (1100 / (20 * logSize));
      System.out.println("You can load " + logsOnTruck + " logs on the truck.");

    } catch (InputMismatchException error) {
      System.out.println("Invalid input, please enter one of the three options.");
      return;
    }

    scanner.close();
  }
}
