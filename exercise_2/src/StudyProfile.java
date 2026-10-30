import java.util.Scanner;
public class StudyProfile {
    public static void main (String[] args){
        int study_minutes;
        String name;
        Scanner input = new Scanner(System.in);
        System.out.println("Planned number of study minutes: ");
        study_minutes = input.nextInt();
        input.nextLine();
        System.out.println("Enter your Full Name: ");
        name = input.nextLine().trim();
        if (name.isEmpty()){
            System.out.println("Invalid Input\n");
            System.out.println("Planned minutes: " + study_minutes);
        }else{
            System.out.println("Full name: " + name);
            System.out.println("Uppercase name: " + name.toUpperCase());
            System.out.println("First character: " + name.charAt(0));
            System.out.println("Planned minutes: " + study_minutes);
        }
    }
}
