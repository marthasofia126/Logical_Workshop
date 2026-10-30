import java.util.Scanner;
public class StudyMenu {
    public static void main (String[] args){
        int choice;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("""
                    Choose an option: 
                    1. Focus 
                    2. Break
                    0. Quit""");
            choice = input.nextInt();
                switch(choice){
                    case 1:
                        System.out.println("\nFocus session: 25 minutes\n");
                        break;
                    case 2:
                        System.out.println("\nShort break: 5 minutes\n");
                        break;
                    case 0:
                        System.out.println("\nGoodbye!");
                        break;

                    default:
                        System.out.println("\nInvalid option\n");
        }} while (choice != 0);
        }
    }
