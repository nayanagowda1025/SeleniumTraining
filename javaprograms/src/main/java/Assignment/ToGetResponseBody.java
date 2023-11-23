package Assignment;

import java.util.Random;
import java.util.Scanner;

import com.nimbusds.jose.shaded.json.JSONObject;

public class ToGetResponseBody {
    public static String generateRandomValue(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder randomValue = new StringBuilder();

        Random random = new Random();

        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(characters.length());
            char randomChar = characters.charAt(randomIndex);
            randomValue.append(randomChar);
        }

        return randomValue.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        JSONObject jsonResponse = new JSONObject();

        String[] predefinedKeys = {"shopper id", "shopper name", "product id", "item"}; 

        for (String key : predefinedKeys) {
            System.out.print("Enter the desired length for the random value for " + key + ": ");
            int length = scanner.nextInt();
            scanner.nextLine(); 

            if (length <= 0) {
                System.out.println("Value length must be greater than 0.");
                return;
            }

            String randomValue = generateRandomValue(length);
            jsonResponse.put(key, randomValue);
        }

        System.out.println("Generated JSON Response Body:");
        System.out.println(jsonResponse.toString());

        scanner.close();
    }
}
