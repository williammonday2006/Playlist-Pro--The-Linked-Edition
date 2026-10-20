public class Main {
    public static void main(String[] args) {
        SinglyLinkedList playlist = new SinglyLinkedList();

        playlist.addLast(new Song("Take Control", "Old Gods of Asgard", 453));
        playlist.addLast(new Song("You Wouldn't Know", "Jonathan Coulton, Ellen McLain", 197));
        playlist.addLast(new Song("Little Wolf", "Jorge Rivera-Herrans", 194));

        System.out.println("Playlist Pro");
        System.out.println("------------");
        playlist.display();
    }
}
