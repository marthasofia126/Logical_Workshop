public class PracticeGrid {
    public static void main (String[] args) {
        int student_index = 0;
        int day_index=0;
        int grand_total=0;
        double total_of_cell=0;
        int [][] completed = {
                {2,3,1},
                {0,4,2},
                {3,1,3}
        };
        for (int i = 0; i < completed.length; i++ ){
            int total_per_student = 0;
            for (int j = 0; j < completed[i].length; j++) {
                total_per_student += completed[i][j];
                student_index=i+1;
            }
            System.out.println("Student " + student_index + " total: "+ total_per_student );
        }
        System.out.println();
        for (int i=0; i < completed.length; i++){
            int total_per_day = 0;
            for (int j = 0; j<completed[i].length;j++){
                total_per_day += completed[j][i];
                day_index=i+1;
                grand_total+=completed[j][i];
                total_of_cell+=1;
            }
            System.out.println("Day " + day_index + " total: "+ total_per_day);
        }
        System.out.println("\nGrand Total: "+grand_total);
        System.out.printf("Average per cell: %.2f", (grand_total/total_of_cell));

    }
}

