import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Song takeControl = new Song("Take Control", "Old Gods of Asgard", 453);
        Song youWouldntKnow = new Song("You Wouldn't Know", "Jonathan Coulton, Ellen McLain", 197);
        Song littleWolf = new Song("Little Wolf", "Jorge Rivera-Herrans", 195);

        SortedLinkedList titlePlaylist = new SortedLinkedList(
            Comparator.comparing(song -> song.getTitle(), String.CASE_INSENSITIVE_ORDER)
        );

        titlePlaylist.addLast(takeControl);
        titlePlaylist.addLast(youWouldntKnow);
        titlePlaylist.addLast(littleWolf);

        System.out.println("Sorted by Title:");
        titlePlaylist.display();

        SortedLinkedList artistPlaylist = new SortedLinkedList(
            Comparator.comparing(song -> song.getArtist(), String.CASE_INSENSITIVE_ORDER)
        );

        artistPlaylist.addLast(takeControl);
        artistPlaylist.addLast(youWouldntKnow);
        artistPlaylist.addLast(littleWolf);

        System.out.println("\nSorted by Artist:");
        artistPlaylist.display();
    }
}