package Store;

import Models.Song;
import java.util.*;

public class RecentlyPlayedStore {
    private int capacity;
    private Map<String, LinkedList<Song>> userSongs;

    public RecentlyPlayedStore(int capacity) {
        this.capacity = capacity;
        this.userSongs = new HashMap<>();
    }

    public void addSong(String userName, String songName) {
        userSongs.putIfAbsent(userName, new LinkedList<>());
        LinkedList<Song> songsList = userSongs.get(userName);

        // Iterate over the list and remove the song if it exists
        Iterator<Song> iterator = songsList.iterator();
        while (iterator.hasNext()) {
            Song song = iterator.next();
            if (song.getSongName().equals(songName)) {
                iterator.remove(); // Remove the song manually
                break; // Exit loop after removing the song
            }
        }

        songsList.add(new Song(songName)); // Add new song

        // Evict the least recent song if capacity is exceeded
        if (songsList.size() > capacity) {
            songsList.removeFirst();
        }
    }

    public List<String> getRecentlyPlayedSongs(String userName) {
        return userSongs.getOrDefault(userName, new LinkedList<>())
                        .stream()
                        .map(Song::getSongName)
                        .toList();
    }

    public static void main(String[] args) {
        RecentlyPlayedStore store = new RecentlyPlayedStore(3);

        store.addSong("user1", "Song1");
        store.addSong("user1", "Song2");
        store.addSong("user1", "Song3");
        System.out.println(store.getRecentlyPlayedSongs("user1")); // [Song1, Song2, Song3]

        store.addSong("user1", "Song4");
        System.out.println(store.getRecentlyPlayedSongs("user1")); // [Song2, Song3, Song4]

        store.addSong("user1", "Song2");
        System.out.println(store.getRecentlyPlayedSongs("user1")); // [Song3, Song4, Song2]
    }
}
