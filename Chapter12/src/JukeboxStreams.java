import java.util.List;
import java.util.stream.Collectors;

public class JukeboxStreams {
    public static void main(String[] args) {
        List<Song> songs = new Songs().getSongs();

        List<Song> rockSongs = songs.stream()
                .filter(song -> song.getGenre().contains("Rock"))
                .collect(Collectors.toList());
        System.out.println(rockSongs);

        List<Song> theBeatlesSongs = songs.stream()
                .filter(song -> song.getArtist().equals("The Beatles"))
                .collect(Collectors.toList());
        System.out.println(theBeatlesSongs);

        List<Song> songsThatStartWithH = songs.stream()
                .filter(song -> song.getTitle().startsWith("H"))
                .collect(Collectors.toList());
        System.out.println(songsThatStartWithH);

        List<Song> moreRecentThan1995Songs = songs.stream()
                .filter(song -> song.getYear() > 1995)
                .collect(Collectors.toList());
        System.out.println(moreRecentThan1995Songs);
    }
}
