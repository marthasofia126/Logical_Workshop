import java.util.Scanner;
public class BookSearch {
    public static void main(String[] args) {
        String codes[] = {"CS101", "JAVA1", "WEB20", "JAVA1"};
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a book code: ");
        String trimed_book_code = input.nextLine().trim();
        int special_marker = -1;

        if (trimed_book_code.isEmpty()) {
            System.out.println("Please enter a code");
            return;
        }
        for (int i = 0; i < codes.length; i++) {
            if (trimed_book_code.equalsIgnoreCase(codes[i])) {
                special_marker = i + 1;
                break;
            }
        }
        if (special_marker == -1) {
            System.out.println("Code not found");
        } else{
            System.out.println("Book found at shelf position: " + special_marker);
        }
    }
}
