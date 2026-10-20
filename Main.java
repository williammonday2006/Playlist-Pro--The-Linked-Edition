import java.util.Comparator;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList playlist = new SinglyLinkedList();

        System.out.println("Test 1: Add to Empty List");
        playlist.addLast(new Song("Take Control", "Old Gods of Asgard", 453));
        playlist.display();

        System.out.println("\nTest 2: Insert at Index 0");
        playlist.add(0, new Song("Little Wolf", "Jorge Rivera-Herrans", 195));
        playlist.display();

        System.out.println("\nTest 3: Remove First Song");
        Iterator<Song> firstIterator = playlist.iterator();
        firstIterator.next();
        firstIterator.remove();
        playlist.display();

        System.out.println("\nTest 4: Remove Last Song");
        Iterator<Song> lastIterator = playlist.iterator();
        while (lastIterator.hasNext()) {
            lastIterator.next();
            if (!lastIterator.hasNext()) {
                lastIterator.remove();
            }
        }
        playlist.display();

        System.out.println("\nTest 5: Invalid Index");
        try {
            playlist.get(0);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid index handled correctly.");
        }

        System.out.println("\nTest 6: Sorted Lists");
        SortedLinkedList sorted = new SortedLinkedList(
            Comparator.comparing(Song::getTitle, String.CASE_INSENSITIVE_ORDER)
        );
        sorted.addLast(new Song("Take Control", "Old Gods of Asgard", 453));
        sorted.addLast(new Song("Little Wolf", "Jorge Rivera-Herrans", 195));
        sorted.display();
    }
}