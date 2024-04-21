package nl.hu.cisq2.exercises;

import nl.hu.cisq2.example.domain.Artist;
import nl.hu.cisq2.example.domain.MockContent;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class GenericsExampleTest {

    @Test
    void testSortWithString() {
        List<String> popularArtists = MockContent.getPopularArtists();

        // Collections.sort(popularArtists);

        Utils.printList(popularArtists);
    }

    @Test
    void testSortWithArtistObject() {
        List<Artist> artists = new ArrayList<>();

        for (String artist : MockContent.getPopularArtists()) {
            artists.add(new Artist(artist));
        }

        // Collections.sort(artists);

        Utils.printList(artists);
    }


}
