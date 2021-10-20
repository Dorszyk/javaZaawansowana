package TypyGeneryczne.Ex4;


public class Book extends MediaConten{

    private String authora;

    public Book(String title, String authora) {
        super(title);
        this.authora = authora;
    }

    @Override
    public String toString() {
        return "Book{" +
                "authora='" + authora + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
