package Assignment;

import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nimbusds.jose.shaded.json.JSONObject;

public class RandomJSON {
	public static void main(String[] args) throws Exception {
		String randomString = null;
		String randomString2 = null;
		//String randomString3=null;

		String userInputJson = "{\"name\":\"STR5\",\"age\":\"INT1\"}";

		ObjectMapper objectMapper = new ObjectMapper();

		Map<String, Object> dataMap = objectMapper.readValue(userInputJson, Map.class);

		String name = (String) dataMap.get("name");
		String age = (String) dataMap.get("age");
		//String marks = (String) dataMap.get("Marks");

		if (name.contains("STR")) {
			String inputString = name;

			// Define a regular expression pattern to match numbers
			Pattern pattern = Pattern.compile("\\d+");

			// Create a matcher to find numbers in the input string
			Matcher matcher = pattern.matcher(inputString);

			// Iterate through the matches and extract the numbers
			while (matcher.find()) {
				String number = matcher.group(); // Get the matched number as a string
				int parsedNumber = Integer.parseInt(number); // Convert the string to an integer if needed
				int stringLength = parsedNumber;

				String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
				StringBuilder randomString1 = new StringBuilder();

				SecureRandom secureRandom = new SecureRandom();

				for (int i = 0; i < stringLength; i++) {
					int randomIndex = secureRandom.nextInt(characters.length());
					char randomChar = characters.charAt(randomIndex);
					randomString1.append(randomChar);
					randomString = randomString1.toString();
				}

			}
			if (age.contains("INT")) {
				String inputString1 = age;

				// Define a regular expression pattern to match numbers
				Pattern pattern1 = Pattern.compile("\\d+");

				// Create a matcher to find numbers in the input string
				Matcher matcher1 = pattern1.matcher(inputString1);

				// Iterate through the matches and extract the numbers
				while (matcher1.find()) {
					String number = matcher1.group(); // Get the matched number as a string
					int parsedNumber = Integer.parseInt(number); // Convert the string to an integer if needed
					int stringLength = parsedNumber;

					String characters = "0987654321";
					StringBuilder randomString1 = new StringBuilder();

					SecureRandom secureRandom = new SecureRandom();

					for (int i = 0; i < stringLength; i++) {
						int randomIndex = secureRandom.nextInt(characters.length());
						char randomChar = characters.charAt(randomIndex);
						randomString1.append(randomChar);
						randomString2 = randomString1.toString();
					}
				
				}

				//System.out.println("Name: " + randomString);
				//System.out.println("Age: " + randomString2);
				//System.out.println("Is Student: " + isStudent);
				JSONObject jsonObject = new JSONObject();
				jsonObject.put("Name", randomString);
				jsonObject.put("Age", randomString2);
				System.out.println(jsonObject.toString());
				
				

			}

		}
	}
}
