package set;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class songs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> playlist = new HashMap<>();

        while (true) {
            System.out.println("\nplayList Menu:");
            System.out.println("1. Add songs");
            System.out.println("2. Display song by selecting singer");
            System.out.println("3. Search song");
            System.out.println("4. Exit");
            System.out.print("Select an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    addSong(scanner, playlist);
                    break;
                case 2:
                    displaySong(playlist);
                    break;
                case 3:
                    searchSong(scanner, playlist);
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

    private static void addSong(Scanner scanner, Map<String, String> playlist) {
        System.out.print("Enter song name: ");
        String song = scanner.nextLine();
        System.out.print("Enter singer: ");
        String singer = scanner.nextLine();

        playlist.put(song, singer);
        System.out.println("song added: " + song);
    }

    private static void displaySong(Map<String, String> playlist) {
        if (playlist.isEmpty()) {
            System.out.println("playlist is empty.");
        } else {
            System.out.println("songs in playlist:");
            for (Map.Entry<String, String> entry : playlist.entrySet()) {
                System.out.println("song: " + entry.getKey() + ", singer: " + entry.getValue());
            }
        }
    }

    private static void searchSong(Scanner scanner, Map<String, String> playlist) {
        System.out.print("Enter song name to search: ");
        String name = scanner.nextLine();

        if (playlist.containsKey(name)) {
            System.out.println("song found: Name: " + name + ", singer: " + playlist.get(name));
        } else {
            System.out.println("Contact not found.");
        }
    }
}


