package nl.hu.cisq2.exercises;

import nl.hu.cisq2.example.domain.*;
import nl.hu.cisq2.example.exercises.CheckAnswerUtils;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GenericsExercisesTest {

    // Schrijf een static method in de GenericExercises class die zowel een List<Content>,
    // als een List<Song> als een List<Movie> als argument accepteert en
    // een List<String> van titles teruggeeft

    // Gebruik deze methode in de volgende drie unit tests

    @Test
    void getMovieTitles() {
        List<Movie> allMovies = MockContent.getPopularMovies();

        // Vervang new ArrayList<>() met je methode
        // gebruik allMovies als argument
        List<String> allMovieTitles = new ArrayList<>();

        Utils.printList(allMovieTitles);

        assertEquals(CheckAnswerUtils.allMovieTitlesUnsorted(), allMovieTitles);
    }

    @Test
    void allSongTitles() {
        List<Song> allSongs = MockContent.getPopularSongs();

        List<String> allSongTitles = new ArrayList<>();

        Utils.printList(allSongTitles);

        assertEquals(CheckAnswerUtils.allSongTitlesUnsorted(), allSongTitles);
    }

    @Test
    void allMoviesAndSongTitles() {
        List<Content> allContent = MockContent.getPopularMedia();

        List<String> allTitles = new ArrayList<>();

        Utils.printList(allTitles);

        assertEquals(CheckAnswerUtils.allTitlesUnsorted(), allTitles);
    }



}