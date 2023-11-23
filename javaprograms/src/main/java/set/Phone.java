package set;

	import java.util.HashMap;
	import java.util.Map;
	import java.util.Scanner;

	public class Phone {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Map<String, String> phonebook = new HashMap<>();

	        while (true) {
	            System.out.println("\nPhonebook Menu:");
	            System.out.println("1. Add Contact");
	            System.out.println("2. Display Contacts");
	            System.out.println("3. Search Contact");
	            System.out.println("4. Exit");
	            System.out.print("Select an option: ");

	            int choice = scanner.nextInt();
	            scanner.nextLine(); // Consume the newline character

	            switch (choice) {
	                case 1:
	                    addContact(scanner, phonebook);
	                    break;
	                case 2:
	                    displayContacts(phonebook);
	                    break;
	                case 3:
	                    searchContact(scanner, phonebook);
	                    break;
	                case 4:
	                    System.out.println("Goodbye!");
	                    scanner.close();
	                    System.exit(0);
	                default:
	                    System.out.println("Invalid option. Please select a valid option.");
	            }
	        }
	    }

	    private static void addContact(Scanner scanner, Map<String, String> phonebook) {
	        System.out.print("Enter contact name: ");
	        String name = scanner.nextLine();
	        System.out.print("Enter phone number: ");
	        String phoneNumber = scanner.nextLine();

	        phonebook.put(name, phoneNumber);
	        System.out.println("Contact added: " + name);
	    }

	    private static void displayContacts(Map<String, String> phonebook) {
	        if (phonebook.isEmpty()) {
	            System.out.println("Phonebook is empty.");
	        } else {
	            System.out.println("Contacts in Phonebook:");
	            for (Map.Entry<String, String> entry : phonebook.entrySet()) {
	                System.out.println("Name: " + entry.getKey() + ", Phone Number: " + entry.getValue());
	            }
	        }
	    }

	    private static void searchContact(Scanner scanner, Map<String, String> phonebook) {
	        System.out.print("Enter contact name to search: ");
	        String name = scanner.nextLine();

	        if (phonebook.containsKey(name)) {
	            System.out.println("Contact found: Name: " + name + ", Phone Number: " + phonebook.get(name));
	        } else {
	            System.out.println("Contact not found.");
	        }
	    }
	}