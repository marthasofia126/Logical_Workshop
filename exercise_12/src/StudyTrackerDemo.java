public class StudyTrackerDemo {
    public static void main (String[] args){
        StudyTracker student1= new StudyTracker("Ana");
        StudyTracker student2= new StudyTracker("Ben");
        System.out.println("Student name: " + student1.getName());
        System.out.println("Session 1 (25 minutes):  " + student1.addSession(25));
        System.out.println("Session 2 (35 minutes): " + student1.addSession(35));
        System.out.println("Session 3 (-5 minutes): " + student1.addSession(-5));
        System.out.println("Total study minutes: " + student1.getTotalMinutes());
        System.out.println("Reached goal of 60 minutes: " + student1.hasReachedGoal(60));
        System.out.println("\nStudent name: " + student2.getName());
        System.out.println("Session 1 (20 minutes):  " + student2.addSession(20));
        System.out.println("Total study minutes: " + student2.getTotalMinutes());
        System.out.println("Reached goal of 60 minutes: " + student2.hasReachedGoal(60));
    }
}
