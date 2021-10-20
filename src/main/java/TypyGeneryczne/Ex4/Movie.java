package TypyGeneryczne.Ex4;

public class Movie extends MediaConten {

    private String direct;

    public Movie(String title, String direct) {
        super(title);
        this.direct = direct;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", direct='" + direct + '\'' +
                '}';
    }
}
