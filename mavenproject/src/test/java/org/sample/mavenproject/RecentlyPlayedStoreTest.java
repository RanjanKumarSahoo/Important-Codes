package org.sample.mavenproject;

import Store.RecentlyPlayedStore;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.List;

public class RecentlyPlayedStoreTest {
    private RecentlyPlayedStore store;

    @BeforeMethod
    public void setup() {
        store = new RecentlyPlayedStore(3);  // Max 3 songs
    }

    @Test
    public void testAddAndRetrieveSongs() {
        store.addSong("user1", "S1");
        store.addSong("user1", "S2");
        store.addSong("user1", "S3");

        Assert.assertEquals(store.getRecentlyPlayedSongs("user1"), List.of("S1", "S2", "S3"));
    }

    @Test
    public void testEviction() {
        store.addSong("user1", "S1");
        store.addSong("user1", "S2");
        store.addSong("user1", "S3");
        store.addSong("user1", "S4");

        Assert.assertEquals(store.getRecentlyPlayedSongs("user1"), List.of("S2", "S3", "S4"));
    }

    @Test
    public void testMoveToRecent() {
        store.addSong("user1", "S1");
        store.addSong("user1", "S2");
        store.addSong("user1", "S3");
        store.addSong("user1", "S2");

        Assert.assertEquals(store.getRecentlyPlayedSongs("user1"), List.of("S1", "S3", "S2"));
    }

    @Test
    public void testMultipleUsers() {
        store.addSong("user1", "S1");
        store.addSong("user2", "A1");
        store.addSong("user1", "S2");
        store.addSong("user2", "A2");

        Assert.assertEquals(store.getRecentlyPlayedSongs("user1"), List.of("S1", "S2"));
        Assert.assertEquals(store.getRecentlyPlayedSongs("user2"), List.of("A1", "A2"));
    }
}
