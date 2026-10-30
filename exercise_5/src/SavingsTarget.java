public class SavingsTarget {
    public static void main (String[] args){
        int balance = 0;
        int weeks = 0;
        int weekly_deposit = 7;
        int target = 30;
        while (balance < target){
            balance+=weekly_deposit;
            weeks++;
            System.out.println("Week # " + weeks);
            System.out.println("Current balance: " + balance + "\n");
        }
        System.out.println("\nTarget reached!");
        System.out.println("Total weeks: " + weeks);
    }
}
