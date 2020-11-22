/*
* The LogTruck program implements an application that
* determines the # of logs able to be places in a truck
* from 3 different lengths.
*
* @author  Ben Whitten
* @version 1.0
* @since   2020-11-22 
*/

import java.util.Scanner;  // Import the Scanner class

public class LogTruck {
  public static void main(String[] args) {
    try {
      // Create a Scanner object
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter the log's length in centimeters of these options [25] [50] [100]:");

      // Read user input
      int logLength = scan.nextInt();
      int numberOfLogs = 0;
      int logWeight = 0;

      //Closing Scanner after use.
      scan.close();

      if (logLength == 25) {
        logWeight = 5;
      } else if (logLength == 50) {
        logWeight = 10;
      } else if (logLength == 100) {
        logWeight = 20;
      }

      numberOfLogs = (1100 / logWeight);
      System.out.println();
      System.out.println();
      System.out.println("The truck can fit:");
      System.out.println(numberOfLogs + " logs");

    } catch (Exception e) {
      System.out.println();
      System.out.println();
      System.out.println("You did not input a valid length.");
    }
  }
}
