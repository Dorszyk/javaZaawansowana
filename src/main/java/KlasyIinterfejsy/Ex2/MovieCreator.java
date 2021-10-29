package KlasyIinterfejsy.Ex2;

public class MovieCreator{

    private String title;
    private String direct;
    private int yearOfRelease;
    private String genre;
    private String publisher;

    public  MovieCreator setTitle(String title){
        this.title = title;
        return this;
    }

    public MovieCreator setDirect(String direct) {
        this.direct = direct;
        return this;
    }

    public MovieCreator setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
        return this;
    }

    public MovieCreator setGenre(String genre) {
        this.genre = genre;
        return this;
    }

    public MovieCreator setPublisher(String publisher) {
        this.publisher = publisher;
        return this;
    }

    public Movie createMovie() {

        Movie movie = new Movie(title, direct, yearOfRelease, genre, publisher);
        return movie;
    }
}

