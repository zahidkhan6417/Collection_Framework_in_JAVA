import java.util.LinkedList;
public class Linked_List {
    public static void main(String[] args) {
        LinkedList<Song>  playlist = new LinkedList<Song>();

        playlist.add(new Song("Shape of You", "Ed Sheeran", 235));
        playlist.add(new Song("Dance Monkey", "Tones and I", 198));
        playlist.add(new Song("Uptown Funk", "Mark Ronson ft. Bruno Mars", 270));

        // Display the playlist
        for (Song song : playlist) {
            System.out.println(song);
        }
    }
}

class Song {
    private String title;
    private String artist;
    private int durationInSeconds;

    public Song(String title, String artist, int durationInSeconds) {
        this.title = title;
        this.artist = artist;
        this.durationInSeconds = durationInSeconds;
    }

    @Override
    public String toString() {
        return "Song: " + title + " by " + artist + " (" + durationInSeconds + " seconds)";
    }
}
