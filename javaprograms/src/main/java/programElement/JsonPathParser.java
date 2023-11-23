package programElement;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import net.minidev.json.JSONArray;	

public class JsonPathParser {

	public static void main(String[] args) {
		String jsonString = "{\"person\":{\"name\":\"John\",\"age\":30,\"address\":{\"city\":\"New York\",\"zipcode\":\"10001\"},\"skills\":[{\"language\":\"Java\",\"level\":\"Intermediate\"},{\"language\":\"JavaScript\",\"level\":\"Advanced\"}]}}";

		JSONParser parser = new JSONParser(); 
		JSONObject json = null;
		try {
			json = (JSONObject) parser. parse(jsonString);
		} catch (ParseException e) {
	
			e.printStackTrace();
		}


		String paths = "person.name";
		String[] keys = paths.split("\\.");
		Object current = json;
		
		for (String key : keys) {
			if (current instanceof JSONObject) {
				current = ((JSONObject) current).get(key);
				
			} else if (current instanceof JSONArray) {
				int index = Integer.parseInt(key.replaceAll("\\D", ""));

				current = ((JSONArray) current).get(index);
				
			}
			
		}
		System.out.println("key:"+paths + ", Value: " + current);
	}
	
}

