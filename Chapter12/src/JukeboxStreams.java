import java.util.Comparator;
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

        List<String> genres = songs.stream()
                .map(song -> song.getGenre())
                .distinct()
                .collect(Collectors.toList());
        System.out.println(genres);

        String songTitle = "With a Little Help from My Friends";
        List<String> result = songs.stream()
                .filter(song -> song.getTitle().equals(songTitle))
                .map(song -> song.getArtist())
                .filter(artist -> !artist.equals("The Beatles"))
                .collect(Collectors.toList());
        System.out.println(result);

        List<Song> resul2 = songs.stream()
                .sorted((o1, o2) -> o1.getYear() - o2.getYear())
                .collect(Collectors.toList());
        System.out.println(resul2);

        List<Song> result3 = songs.stream()
                .sorted(Comparator.comparingInt(Song::getYear))
                .collect(Collectors.toList());
        System.out.println(result3);
    }
}
