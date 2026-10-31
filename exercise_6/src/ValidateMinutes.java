import java.util.Scanner;
public class ValidateMinutes {
    public static void main (String[] args) {
        boolean keep_going = true;
            while (keep_going) {
                Scanner input = new Scanner(System.in);
                System.out.println("Which number would you like to display?: ");
                String text = input.nextLine().trim();
                try {
                    int number = Integer.parseInt(text);
                    if (number > 0 && number <= 120) {
                        System.out.println("\nAccepted! Your number is: " + number);
                        keep_going=false;
                    } else {
                        System.out.println("Use a number from 1 through 120\n");
                    }
                } catch (NumberFormatException ex) {
                    System.out.println("\nPlease, enter a whole number\n");
                }
            }
        }
    }
