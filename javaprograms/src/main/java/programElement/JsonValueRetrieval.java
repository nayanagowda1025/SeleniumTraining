package programElement;
	import java.util.ArrayList;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

	public class JsonValueRetrieval {

	    public static void main(String[] args) throws Exception {
	      
	        String jsonString = "{\"person\":{\"name\":\"John\",\"languages\":[\"Java\",\"JavaScript\"],\"addresses\":[{\"city\":\"New York\"},{\"city\":\"San Francisco\"}]}}";

	       ArrayList list = new ArrayList();
	        ObjectMapper objectMapper = new ObjectMapper();
	        JsonNode jsonNode = objectMapper.readTree(jsonString);

	        
	        String[] paths = {
	            "person",
	            "person.languages[1]",
	            "person.addresses[0].city"
	        };

	        
	        for (String path : paths) {
	           // Object value = getValueByPath(jsonNode, path);
	            //System.out.println("Path: " + path + ", Value: " + value);
	            list.add(getValueByPath(jsonNode, path));
	        }
	        System.out.println(list);
	    }
	   

	    private static Object getValueByPath(JsonNode jsonNode, String path) {
	        String[] keys = path.split("\\.");
	        for (String key : keys) {
	            if (key.endsWith("]")) {
	                String fieldName = key.substring(0, key.indexOf('['));
	                int index = Integer.parseInt(key.substring(key.indexOf('[') + 1, key.indexOf(']')));
	                jsonNode = jsonNode.get(fieldName).get(index);
	            } else {
	                jsonNode = jsonNode.get(key);
	            }

	            if (jsonNode == null) {
	                return null;
	            }
	        }

	        return jsonNode.isTextual() ? jsonNode.textValue() : jsonNode;
	    }
	}
