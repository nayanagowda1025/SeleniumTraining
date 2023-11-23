package programElement;

	import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

	public class MultipleFilterSelection {

	    public static void main(String[] args) {
	        // Get the filters as a user-input string
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter filters and sub-filters (use ';' as delimiter): ");
	        String filtersString = scanner.nextLine();

	        // Split the string into an array of filters using ';' as the delimiter
	        String[] filterTokens = filtersString.split(";");

	        // Create a map to store filters and their sub-filters
	        Map<String, String[]> filterMap = new LinkedHashMap<>();

	        // Process each filter token
	        for (String filterToken : filterTokens) {
	            // Split the filter token into filter and sub-filters
	            String[] filterComponents = filterToken.trim().split(":");
	            String filter = filterComponents[0].trim();
	            String subFilters = filterComponents.length > 1 ? filterComponents[1].trim() : null;

	            // Store the filter and sub-filters in the map
	            filterMap.put(filter, subFilters != null ? subFilters.split(",") : new String[0]);
	        }

	        // Print selected filters and sub-filters
	        System.out.println("Selected Filters and Sub-filters:");
	        for (Map.Entry<String, String[]> entry : filterMap.entrySet()) {
	            System.out.println("Filter: " + entry.getKey()+""+Arrays.toString(entry.getValue()));
	            System.out.println("Sub-filters: " + Arrays.toString(entry.getValue()));
	          
	        }
	    }
	}



