package nl.hu.cisq2.example.domain;

public class Artist {

    private final String name;

    public Artist(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Artist{" +
                "name='" + name + '\'' +
                '}';
    }
}
