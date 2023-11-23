package Assignment;
	import java.util.HashMap;
	import java.util.Map;
	import java.util.Random;

	import com.nimbusds.jose.shaded.json.JSONObject;

	public class RandomJsonGenerator{
	    public static void main(String[] args) {
	        JSONObject jsonObject = new JSONObject();

	        Map<String, Object> randomData = new HashMap<>();
	        randomData.put("shopperName", getRandomString(10)); 
	        randomData.put("shopperId", getRandomNumber(1, 100)); 
	        randomData.put("productName", getRandomString(5)); 
	        randomData.put("productId", getRandomNumber(1, 50)); 

	        jsonObject.put("data", randomData);
	        System.out.println(jsonObject.toString());
	    }

	    public static String getRandomString(int length) {
	        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
	        StringBuilder stringBuilder = new StringBuilder();
	        Random random = new Random();
	        for (int i = 0; i < length; i++) {
	            int index = random.nextInt(characters.length());
	            stringBuilder.append(characters.charAt(index));
	        }
	        return stringBuilder.toString();
	    }
	    public static int getRandomNumber(int min, int max) {
	        Random random = new Random();
	        return random.nextInt(max - min + 1) + min;
	    }
	}


