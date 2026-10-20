import java.util.Iterator;
import java.util.NoSuchElementException;

public class SinglyLinkedList implements Iterable<Song> {
    protected class Node {
        Song data;
        Node next;

        Node(Song data) {
            this.data = data;
            this.next = null;
        }
    }

    protected Node head;

    public void addLast(Song song) {
        Node newNode = new Node(song);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    public void display() {
        for (Song song : this) {
            System.out.println(song);
        }
    }

    @Override
    public Iterator<Song> iterator() {
        return new Iterator<Song>() {
            private Node nextNode = head;
            private Node previous;
            private Node lastReturned;
            private Node previousToLast;
            private boolean canRemove = false;

            @Override
            public boolean hasNext() {
                return nextNode != null;
            }

            @Override
            public Song next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }

                previousToLast = previous;
                lastReturned = nextNode;
                previous = nextNode;
                nextNode = nextNode.next;
                canRemove = true;

                return lastReturned.data;
            }

            @Override
            public void remove() {
                if (!canRemove) {
                    throw new IllegalStateException();
                }

                if (lastReturned == head) {
                    head = nextNode;
                } else {
                    previousToLast.next = nextNode;
                }

                previous = previousToLast;
                canRemove = false;
            }
        };
    }
}