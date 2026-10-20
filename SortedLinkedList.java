import java.util.Comparator;

public class SortedLinkedList extends SinglyLinkedList {
    private Comparator<Song> comparator;

    public SortedLinkedList(Comparator<Song> comparator) {
        this.comparator = comparator;
    }

    @Override
    public void add(int index, Song song) {
        Node newNode = new Node(song);

        if (head == null || comparator.compare(song, head.data) < 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node current = head;

        while (current.next != null && comparator.compare(song, current.next.data) >= 0) {
            current = current.next;
        }

        newNode.next = current.next;
        current.next = newNode;
    }

    @Override
    public void addLast(Song song) {
        add(0, song);
    }
}
