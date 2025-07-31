import java.util.Scanner;
class Song {
    String title;
    Song next;
    Song prev;

    public Song(String title) {
        this.title = title;
        this.next = this.prev = this; 
    }
}

class Playlist {
    private Song current = null;

    public void addSong(String title) {
        Song newSong = new Song(title);

        if (current == null) {
            current = newSong;
        } else {
            Song last = current.prev;

            last.next = newSong;
            newSong.prev = last;

            newSong.next = current;
            current.prev = newSong;
        }

        System.out.println("Added: " + title);
    }

    public void removeCurrentSong() {
        if (current == null) {
            System.out.println("\nPlaylist is empty!");
            return;
        }

        System.out.println("Removed: " + current.title);

        if (current.next == current) {
            current = null;
        } else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
            current = current.next;
        }
    }

    public void nextSong() {
        if (current != null) {
            current = current.next;
            System.out.println("\nNow playing: " + current.title);
        } else {
            System.out.println("\nPlaylist is empty!");
        }
    }

    public void previousSong() {
        if (current != null) {
            current = current.prev;
            System.out.println("Now playing: " + current.title);
        } else {
            System.out.println("\nPlaylist is empty!");
        }
    }

    public void showCurrentSong() {
        if (current != null) {
            System.out.println("Currently playing: " + current.title);
        } else {
            System.out.println("\nPlaylist is empty!");
        }
    }

    public void showPlaylist() {
        if (current == null) {
            System.out.println("\nPlaylist is empty!");
            return;
        }

        Song temp = current;
        System.out.println("Playlist:");

        do {
            System.out.println("- " + temp.title);
            temp = temp.next;
        } while (temp != current);
    }
}

public class MusicPlaylist {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Playlist playlist = new Playlist();

        while (true) {
            System.out.println("\n  Music Playlist Menu:");
            System.out.println("1. Add Song");
            System.out.println("2. Remove Current Song");
            System.out.println("3. Next Song");
            System.out.println("4. Previous Song");
            System.out.println("5. Show Current Song");
            System.out.println("6. Show Full Playlist");
            System.out.println("0. Exit");
            System.out.print("\nChoose an option: ");
            int choice = input.nextInt();
            input.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter song title: ");
                    String title = input.nextLine();
                    playlist.addSong(title);
                    break;
                case 2:
                    playlist.removeCurrentSong();
                    break;
                case 3:
                    playlist.nextSong();
                    break;
                case 4:
                    playlist.previousSong();
                    break;
                case 5:
                    playlist.showCurrentSong();
                    break;
                case 6:
                    playlist.showPlaylist();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    input.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
