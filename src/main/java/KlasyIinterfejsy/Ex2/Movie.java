package KlasyIinterfejsy.Ex2;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Movie {

    private String title;
    private String direct;
    private int yearOfRelease;
    private String genre;
    private String publisher;


    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", direct='" + direct + '\'' +
                ", yearOfRelease='" + yearOfRelease + '\'' +
                ", genre='" + genre + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }
}
