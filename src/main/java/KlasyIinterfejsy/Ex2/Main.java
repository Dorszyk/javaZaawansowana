package KlasyIinterfejsy.Ex2;

public class Main {

    public static void main(String[] args) {

        Movie movie = new MovieCreator()
                .setTitle("Star Wars")
                .setDirect("J.J Abrams")
                .setGenre("Actions")
                .setYearOfRelease(2015)
                .setPublisher("Disney")
                .createMovie();
        System.out.println(movie);
    }
}
