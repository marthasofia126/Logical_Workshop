import java.util.Scanner;
public class PlayerConsistency {
    public static void main (String[] args){
        int [] scores = new int[7];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++){
            System.out.println("Enter the game score: ");
            int score_number = Integer.parseInt(input.nextLine());
            scores[i] = score_number;
        }
        System.out.println("Average of scores: " + average(scores));

    }
    public static double average(int [] values){
        double total = 0;
        for (int i = 0; i < values.length; i++){
            total+=values[i];
        }
        return (double) total/values.length;
    }
    public static int [] aboveAverage(int [] values){
        int scores_above_average=0;
        int j = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] > average(values)){
                scores_above_average+=1;
            }
        }
        int [] above_average_scores = new int [scores_above_average];
        for (int i = 0; i<values.length; i++){
            if (values[i] > average(values)){
                above_average_scores[j]+=values[i];
                j+=1;
            }
        }
        return above_average_scores;
    }

    public static void validating(int [] values, int[] value){
        for (int i = 0; i < values.length; i++){
            for (int j = 0; j < value.length; j++){
                if (values[i]==value[j]){
                    System.out.println("Game " + (i+1)+ ": " + value[j] + " points");
                    break;
                }
            }
        }
    }
}
