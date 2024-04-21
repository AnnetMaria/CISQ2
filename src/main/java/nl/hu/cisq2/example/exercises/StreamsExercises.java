package nl.hu.cisq2.example.exercises;

import nl.hu.cisq2.example.domain.Content;
import nl.hu.cisq2.example.domain.Movie;

import java.util.List;

public class StreamsExercises {

    // gebruik .map()
    public static List<Content> getAllTitles(List<Content> content) {
        return null;
    }

    // gebruik .reduce()
    public static int calculateTotalRatingWithReduce(List<? extends Content> contents) {
        return 0;
    }

    // gebruik .sum()
    public static int calculateTotalRatingWithSum(List<? extends Content> contents) {
        return 0;
    }

    // gebruik whatever
    public static int calculateAverageRating(List<? extends Content> contents) {
        return 0;
    }

    // use findFirst() of findAny()
    public static <T extends Content> Content getContentWithRatingOff(int rating, List<T> contentList) {
        return null;
    }

    public static <T extends Content> List<T> getContentSortedByTitle(List<T> content) {
        return null;
    }

    public static <T extends Content> List<T> getContentSortedByRating(List<T> content) {
        return null;
    }

    // gebruik allMatch()
    public static <T extends Content> boolean allRatingsHigherThan(int rating, List<T> content) {
        return false;
    }

    // gebruik noneMatch()
    public static <T extends Content> boolean noRatingLowerThan(int rating, List<T> content) {
        return false;
    }

    // gebruik anyMatch()
    public static <T extends Content> boolean anyRatingHigherThan(int rating, List<T> content) {
        return false;
    }

    // gebruik IntStream.range()
    public static boolean compareMovieLists(List<Movie> list1, List<Movie> list2) {
        return false;
    }

}
