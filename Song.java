public class Song {
    private String title;
    private String artist;
    private int duration;

    public Song(String title, String artist, int duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    @Override
    public String toString() {
        int minutes = duration / 60;
        int seconds = duration % 60;
        return title + " by " + artist + " (" + minutes + ":" + String.format("%02d", seconds) + ")";
    }
    public String getTitle() {
    return title;
    }

    public String getArtist() {
    return artist;
    }
}
