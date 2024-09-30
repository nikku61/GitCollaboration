import java.util.Scanner;

class Clock {
    static double conversion;
    static double value;
    static double num = 60;

    public static double secondstoMinutes() {
        return (value / num);
    }

    public static double secondstoHours() {
        return (value / num / num);
    }

    public static double minutestoSeconds() {
        return (value * num);
    }

    public static double minutestoHours() {
        return (value / num);
    }

    public static double hourstoSeconds() {
        return (value * num * num);
    }

    public static double hourstoMinutes() {
        return (value * num);
    }

    public static void getInput() {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Choose the Conversion: ");
        conversion = userInput.nextDouble();
        System.out.println("Enter the Value: ");
        value = userInput.nextDouble();

    }


    static class Choices {
        public static void outputChoices() {
            System.out.println("[1] Seconds to Minutes");
            System.out.println("[2] Seconds to Hours");
            System.out.println("[3] Minutes to Seconds");
            System.out.println("[4] Minutes to Hours");
            System.out.println("[5] Hours to Seconds");
            System.out.println("[6] Hours to Minutes");
        }

    }

    public static class Main {
        public static void main(String[] args) {
            Choices time = new Choices();
            Clock clock = new Clock();
            Scanner convert = new Scanner(System.in);
            String input;

        do {
            time.outputChoices();
            clock.getInput();

                switch ((int) conversion) {
                    case 1:
                        System.out.println("Seconds to Minutes: " + clock.secondstoMinutes());
                        break;
                    case 2:
                        System.out.println("Seconds to Minutes: " + clock.secondstoHours());
                        break;
                    case 3:
                        System.out.println("Seconds to Minutes: " + clock.minutestoSeconds());
                        break;
                    case 4:
                        System.out.println("Seconds to Minutes: " + clock.minutestoHours());
                        break;
                    case 5:
                        System.out.println("Seconds to Minutes: " + clock.hourstoSeconds());
                        break;
                    case 6:
                        System.out.println("Seconds to Minutes: " + clock.hourstoMinutes());
                        break;


                }
                System.out.println("Do you want to convert time? (Y/N):");
                input = convert.next();
                System.out.println("-------------------------------------------------------");
            }
        while (input.equalsIgnoreCase("Y"));
            convert.close();
        }

    }
}
