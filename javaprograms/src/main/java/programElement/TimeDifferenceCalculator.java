package programElement;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TimeDifferenceCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");

        
        
        
        try {
            // Input the first time
            System.out.print("Enter the first time (HH:mm): ");
            String inputTime1 = scanner.nextLine();
            Date time1 = sdf.parse(inputTime1);
            SimpleDateFormat sdf1 = new SimpleDateFormat("HH:mm");
           
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            //String outputTime = outputSdf.format(time1);
            // Input the second time
            System.out.print("Enter the second time (HH:mm): ");
            String inputTime2 = scanner.nextLine();
            Date time2 = sdf.parse(inputTime2);
            
            // Calculate the time difference in milliseconds
            long timeDifference = time2.getTime() - time1.getTime();
            
            // Convert milliseconds to hours and minutes
            long minutes = timeDifference / (60 * 1000);
            long hours = minutes / 60;
            
            // Calculate remaining minutes
            minutes %= 60;
            
            System.out.println("Time Difference: " + hours + " hours, " + minutes + " minutes");
        } catch (Exception e) {
            System.err.println("Invalid input format. Please use the format HH:mm.");
        }
        
        scanner.close();
    }
}
