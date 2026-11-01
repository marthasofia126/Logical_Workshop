public class StudyTracker {
    private String name;
    private int total_minutes;

    public StudyTracker(String name){
        this.name=name.trim();
        this.total_minutes=0;

    }
    public boolean addSession(int minutes){
        boolean status = minutes>0 && minutes <=120;
        if (status){
            total_minutes+=minutes;
        }
        return status;
    }

    public String getName() {
        return this.name;
    }

    public int getTotalMinutes(){
        return this.total_minutes;
    }

    public boolean hasReachedGoal(int goal){
        boolean goal_reached = total_minutes >= goal;
        if (goal_reached){
            return true;
        }
        else {
            return false;
        }
    }
}
