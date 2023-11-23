package programElement;

	import java.text.ParseException;
	import java.text.SimpleDateFormat;
	import java.util.Date;
	import java.util.Scanner;

	public class Convert24HrTo12HrFormat {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        SimpleDateFormat inputSdf = new SimpleDateFormat("HH:mm");
	        SimpleDateFormat outputSdf = new SimpleDateFormat("hh:mm a");
	        
	        try {
	            // Input the time in 24-hour format
	            System.out.print("Enter the time in 24-hour format (HH:mm): ");
	            String inputTime = scanner.nextLine();
	            Date date = inputSdf.parse(inputTime);
	            
	            // Format the time in 12-hour format
	            String outputTime = outputSdf.format(date);
	            
	            System.out.println("Time in 12-hour format: " + outputTime);
	        } catch (ParseException e) {
	            System.err.println("Invalid input format. Please use the format HH:mm.");
	        }
	        
	        scanner.close();
	    }
	}



