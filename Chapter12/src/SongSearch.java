import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SongSearch {
    private final List<Song> songs = new JukeboxData.Songs().getSongs();
    void printTopFiveSongs() {
        List<String> topFive = songs.stream()
                .sorted(Comparator.comparingInt(Song::getTimesPlayed))
                .map(song -> song.getTitle())
                .limit(5)
                .collect(Collectors.toList());
    }

    void search(String artist) {
        Optional<Song> result = songs.stream()
                .filter(song -> song.getArtist().equals(artist))
                .findFirst();
        if (result.isPresent()) {
            System.out.println(result.get().getTitle());
        }
        else {
            System.out.println("No song found by: " + artist);
        }
    }
}
