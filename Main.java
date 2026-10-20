import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList playlist = new SinglyLinkedList();

        playlist.addLast(new Song("Take Control", "Old Gods of Asgard", 453));
        playlist.addLast(new Song("You Wouldn't Know", "Jonathan Coulton, Ellen McLain", 197));
        playlist.addLast(new Song("Little Wolf", "Jorge Rivera-Herrans", 195));

        System.out.println("All Songs:");
        for (Song song : playlist) {
            System.out.println(song);
        }

        Iterator<Song> iterator = playlist.iterator();
        while (iterator.hasNext()) {
            Song song = iterator.next();
            if (song.toString().startsWith("You Wouldn't Know")) {
                iterator.remove();
                break;
            }
        }

        System.out.println("\nAfter Removing a Song:");
        playlist.display();
    }
}