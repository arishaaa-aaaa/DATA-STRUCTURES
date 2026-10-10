import java.util.Scanner;

public class MusicPlaylistScenario {

    // Node class to represent each song in the playlist
    static class Song {
        String title;
        Song next;

        Song(String title) {
            this.title = title;
            this.next = null;
        }
    }

    // Head pointer to keep track of the first song
    Song head = null;

    // Add song to the playlist (Insertion at the end)
    void addSong(String title) {
        Song newSong = new Song(title);
        if (head == null) {
            head = newSong;
        } else {
            Song current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newSong;
        }
        System.out.println("Song \"" + title + "\" added to the playlist.");
    }

    // Remove the played song (Deletion from the front)
    void removeSong() {
        if (head == null) {
            System.out.println("Playlist is empty! No songs to remove.");
        } else {
            System.out.println("Song \"" + head.title + "\" played and removed from playlist.");
            head = head.next;
        }
    }

    // Display the entire playlist
    void displayPlaylist() {
        if (head == null) {
            System.out.println("Playlist is currently empty.");
        } else {
            System.out.println("\n--- Current Music Playlist ---");
            Song current = head;
            int index = 1;
            while (current != null) {
                System.out.println(index + ". " + current.title);
                current = current.next;
                index++;
            }
        }
    }

    public static void main(String[] args) {
        MusicPlaylistScenario playlist = new MusicPlaylistScenario();
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Music Playlist Menu ---");
            System.out.println("1. Add Song");
            System.out.println("2. Remove Played Song");
            System.out.println("3. Display Playlist");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            input.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter song title: ");
                    String title = input.nextLine();
                    playlist.addSong(title);
                    break;
                case 2:
                    playlist.removeSong();
                    break;
                case 3:
                    playlist.displayPlaylist();
                    break;
                case 4:
                    System.out.println("Program ended. Enjoy your music!");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 4);

        input.close();
    }
}