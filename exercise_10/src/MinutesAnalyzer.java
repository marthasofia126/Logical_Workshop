public class MinutesAnalyzer {
    public static void main (String[]args){
        int [] minutes = {20,35,15,40,30};
        int min = 30;
        System.out.println("Total sum: " + sum(minutes));
        System.out.println("Days with at least 30 min: " + countAtLeast(minutes,min));
        System.out.println("Average minutes: " + average(minutes));
    }
    public static int sum (int[] values){
        int calc=0;
        for (int i = 0; i < values.length; i++){
            calc+=values[i];
        }
        return calc;
    }
    public static int countAtLeast(int[] values, int threshold){
        int number_of_greater=0;
        for (int i = 0; i < values.length; i++){
            if (values[i]>=threshold){
                number_of_greater+=1;
            }
        }
        return number_of_greater;
    }
    public static double average(int[] values){
        if (values == null || values.length==0){
            throw new IllegalArgumentException ("Array is empty");
        } else {
            double average = (double) sum(values)/values.length;
            return average;
        }
    }
}
