package Assignment;

	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.util.Map;
	import java.util.Random;

	import com.fasterxml.jackson.core.JsonProcessingException;
	import com.fasterxml.jackson.databind.ObjectMapper;

	public class RandomString {
	    public static void main(String[] args) throws JsonProcessingException, FileNotFoundException {      
	        String json = "{\"channel_id\":\"RAN>>5\",\"user_id\": \"STR>>4\",\"machine_name\": \"STR>>4\",\"api_code\": \"RAN>>3\"}";

	    	 try {
	             ObjectMapper objectMapper = new ObjectMapper();
	             Map<String, String> map = objectMapper.readValue(json, Map.class);
	             map = replacePlaceholdersWithRandomStrings(map);
	             String json1 = objectMapper.writeValueAsString(map);
	             System.out.println(json1); 
	         } catch (IOException e) {
	             e.printStackTrace();
	         }
	    }

	    public static Map<String, String> replacePlaceholdersWithRandomStrings(Map<String, String> jsonMap) {
	        for (Map.Entry<String, String> mapData : jsonMap.entrySet()) {
	            String key = mapData.getKey();
	            String value = mapData.getValue();
	            if (value.startsWith("RAN>>")) {
	                int startIndex = "RAN>>".length();
	                int length = Integer.parseInt(value.substring(startIndex));
	                String randomString = generateRandomString(length);
	                jsonMap.put(key, randomString);
	            } else if (value.startsWith("STR>>")) {
	                int startIndex = "STR>>".length();
	                int length = Integer.parseInt(value.substring(startIndex));
	                String fixedString = generateFixedString(length);
	                jsonMap.put(key, fixedString);
	            }
	        }
	        return jsonMap;
	    }

	    public static String generateRandomString(int length) {
	        StringBuilder randomIntegerString = new StringBuilder();
	        Random random = new Random();
	        for (int i = 0; i < length; i++) {
	            int digit = random.nextInt(10);
	            randomIntegerString.append(digit);
	        }
	        return randomIntegerString.toString();
	    }
	   public static String generateFixedString(int length) {
	        return "Fixed"; 
	    }
	}

