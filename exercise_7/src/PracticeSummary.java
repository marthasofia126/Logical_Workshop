public class PracticeSummary {
    public static void main (String[] args){
        double total_minutes=0;
        int days_more_than_30=0;
        int longest_day=0;
        int longest_date=0;
        int [] minutes = {20,35,15,40,30};
        for (int i = 0; i < minutes.length; i++){
            total_minutes+=minutes[i];
            if (minutes[i] >= 30){
                days_more_than_30+=1;
            }
            if (minutes[i]>longest_day){
                longest_day=minutes[i];
                longest_date=i+1;
            }
        }
        double average_per_day = total_minutes/minutes.length;
        System.out.println("PRACTICE SUMMARY");
        System.out.println("Total minutes: " + total_minutes);
        System.out.println("Average practice minutes per day: " + average_per_day);
        System.out.println("Days with at least 30 minutes: " + days_more_than_30);
        System.out.println("Longest practice session: " + longest_day + " minutes");
        System.out.println("Days with the longest practice session: Day " + longest_date);
    }
}
