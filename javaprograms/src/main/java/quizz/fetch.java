package quizz;


	import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import net.minidev.json.JSONArray;

	public class fetch {
	    public static void main(String[] args) throws ParseException {
	        // Your JSON string
	    	String jsonString = "{\"name\":[{\"class\":[{\"sub\":\"maths\"}]},{\"marks\":98,\"greet\":\"hello\"},[{\"age\":{\"age2\":4}}] ],\"student\":\"Adil\"}";
	    	
    	JSONParser parser = new JSONParser();  
		JSONObject json = null;	
//			
				json = (JSONObject) parser. parse(jsonString);
			
	        // Parse the JSON string
	        JSONObject jsonObject = new JSONObject();

	        // Specify the key to extract
	        String keyToExtract = "student";

	        // Extract the value using the provided key
	        Object extractedValue = extractValue(jsonObject, keyToExtract);

	        // Print the extracted value
	        System.out.println("Extracted Value: " + extractedValue);
	    }

	    // Function to extract a value from a nested JSON object using a key
	    private static Object extractValue(JSONObject jsonObject, String key) {
	        String[] keys = key.split("\\.");

	        Object result = jsonObject;
	        for (String k : keys) {
	        	System.out.println(k);
	            if (result instanceof JSONObject) {
	            	
	               result = ((JSONObject) result).get(k);
	               // result = ((JSONObject) result).get(k);
	                
	            } else if (result instanceof JSONArray) {
	            	//k.replaceAll(k, " ");
	                int index = Integer.parseInt(k.replaceAll("\\D", ""));
	                result = ((JSONArray) result).get(index);
	               
	            }
	        }

	        return result;
//	    	JSONObject json = new JSONObject(jsonString.toString());
//	        JSONArray result = json.getJSONArray("person");
//	        JSONObject result1 = result.getJSONObject(0);
//	        JSONObject geometry = result1.getJSONObject("name");
//	       // JSONObject locat = geometry.getJSONObject("age2");
	//
//	        //"iterate onto level of location";
	//
//	         String lat = geometry.getString("name");
	      //  double lng = locat.getDouble("lng");
	    }
	}
