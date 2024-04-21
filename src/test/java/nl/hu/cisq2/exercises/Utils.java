package nl.hu.cisq2.exercises;

import java.util.List;

public class Utils {

    static <T> void printContent(T content) {}
    static <T> void printList(List<T> objects) {
        objects.forEach(System.out::println);
    }


}
