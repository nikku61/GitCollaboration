import java.util.Scanner;

public class Clock {
    // Method to convert seconds to minutes
    public double SecondstoMinutes(int value) {
        return (value / 60.0); // Divide by 60 to convert seconds to minutes
    }

    // Method to convert seconds to hours
    public double SecondstoHours(int value) {
        return (value / 3600.0); // Divide by 3600 to convert seconds to hours
    }

    // Method to convert minutes to seconds
    public double MinutestoSeconds(int value) {
        return (value * 60.0); // Multiply by 60 to convert minutes to seconds
    }

    // Method to convert minutes to hours
    public double MinutestoHours(int value) {
        return (value / 60.0); // Divide by 60 to convert minutes to hours
    }

    // Method to convert hours to seconds
    public double HourstoSeconds(int value) {
        return (value * 3600.0); // Multiply by 3600 to convert hours to seconds
    }

    // Method to convert hours to minutes
    public double HourstoMinutes(int value) {
        return (value * 60.0); // Multiply by 60 to convert hours to minutes
    }

    public static void main(String[] args) {
        // Create an instance of the Clock class to access the conversion methods
        Clock clock = new Clock();

        // Create a Scanner object to get input from the user
        Scanner converter = new Scanner(System.in);

        char next; // Variable to store whether the user wants to perform another conversion

        do {
            // Display conversion options
            System.out.println("[1] Seconds to Minutes");
            System.out.println("[2] Seconds to Hours");
            System.out.println("[3] Minutes to Seconds");
            System.out.println("[4] Minutes to Hours");
            System.out.println("[5] Hours to Seconds");
            System.out.println("[6] Hours to Minutes");
            System.out.print("Choose the Conversion: ");

            int choice = converter.nextInt(); // Get the user's choice of conversion
            int value; // Variable to store the value to be converted

            // Perform the conversion based on the user's choice
            switch (choice) {
                case 1:
                    System.out.print("Enter the value (in seconds): ");
                    value = converter.nextInt(); // Get the input value in seconds
                    System.out.println("Seconds to Minutes: " + clock.SecondstoMinutes(value)); // Convert and print result
                    break;
                case 2:
                    System.out.print("Enter the value (in seconds): ");
                    value = converter.nextInt(); // Get the input value in seconds
                    System.out.println("Seconds to Hours: " + clock.SecondstoHours(value)); // Convert and print result
                    break;
                case 3:
                    System.out.print("Enter the value (in minutes): ");
                    value = converter.nextInt(); // Get the input value in minutes
                    System.out.println("Minutes to Seconds: " + clock.MinutestoSeconds(value)); // Convert and print result
                    break;
                case 4:
                    System.out.print("Enter the value (in minutes): ");
                    value = converter.nextInt(); // Get the input value in minutes
                    System.out.println("Minutes to Hours: " + clock.MinutestoHours(value)); // Convert and print result
                    break;
                case 5:
                    System.out.print("Enter the value (in hours): ");
                    value = converter.nextInt(); // Get the input value in hours
                    System.out.println("Hours to Seconds: " + clock.HourstoSeconds(value)); // Convert and print result
                    break;
                case 6:
                    System.out.print("Enter the value (in hours): ");
                    value = converter.nextInt(); // Get the input value in hours
                    System.out.println("Hours to Minutes: " + clock.HourstoMinutes(value)); // Convert and print result
                    break;
                default:
                    System.out.println("Invalid option, try again."); // Handle invalid choices
                    break;
            }

            // Ask the user if they want to perform another conversion
            System.out.print("Do you want to convert time? (Y/N): ");

            next = converter.next().charAt(0); // Read the first character of the input

            // Line separator for clarity
            System.out.println("--------------------------------------");

        } while (next == 'y' || next == 'Y'); // Continue if the user inputs 'Y' or 'y'

        // Close the scanner to prevent resource leaks
        converter.close();

        // Message to indicate the program is exiting
        System.out.println("Exiting...");
    }
}
