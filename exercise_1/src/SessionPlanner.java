public class SessionPlanner {
    private final static int BLOCK_MINUTES = 25;
    public static void main (String[] args){
        int total_minutes = 135;
        double hours= total_minutes/60.0;
        System.out.println("Complete blocks: " + total_minutes/BLOCK_MINUTES);
        System.out.println("Leftover minutes: " + total_minutes%BLOCK_MINUTES);
        System.out.printf("Decimal Hours: %.2f hours%n", hours );
    }
}
