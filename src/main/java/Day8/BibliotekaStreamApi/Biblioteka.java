package Day8.BibliotekaStreamApi;


import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Biblioteka {

    List<Egzemplarz> egzemplarzs;

    public Biblioteka(Egzemplarz[] egzemplarzs) {
        this.egzemplarzs = List.of(egzemplarzs);
    }

    public Optional<Egzemplarz> findByTitle(String titleToFind) {
        return egzemplarzs.stream()
                .filter((e) -> e.tile.equalsIgnoreCase(titleToFind))
                .findAny();
    }

    public Optional<Egzemplarz> findByAuthor(Autor author) {
        return egzemplarzs.stream()
                .filter((s) -> s.autor.equals(author))
                .distinct( e ->)
                .collect(Collectors.toList());

    }

    public Optional<Autor> findByAutorsWithMostBook(Autor mostBook) {
        return () ;

    }

    private int findIndexOfMaxValue(int[] numberOfBooksFromAuthor) {
        int currentMax = 0;
        int indexOfMaxElement = 0;
        for (int i = 0; i < numberOfBooksFromAuthor.length; i++) {
            if (numberOfBooksFromAuthor[i] > currentMax) {
                currentMax = numberOfBooksFromAuthor[i];
                indexOfMaxElement = i;

            }
        }
        return indexOfMaxElement;
    }


    private Autor[] removeDuplicatesFromTableAndTrim(Autor[] tableOfAuthorsFromAllBooks) {

        for (int i = 0; i < tableOfAuthorsFromAllBooks.length; i++) {
            Autor original = tableOfAuthorsFromAllBooks[i];
            if (tableOfAuthorsFromAllBooks[i] != null) {
                original = tableOfAuthorsFromAllBooks[i];
            }
            for (int j = i + 1; j < tableOfAuthorsFromAllBooks.length; j++) {
                if ((original.equals(tableOfAuthorsFromAllBooks[j]))) {
                    tableOfAuthorsFromAllBooks[j] = null;

                }
            }
        }
        return trimTable(tableOfAuthorsFromAllBooks);
    }

    private Autor[] removeDuplicates(Autor[] tableOfAuthorsFromAllBooks) {

        for (int i = 0; i < tableOfAuthorsFromAllBooks.length; i++) {
            Autor original = tableOfAuthorsFromAllBooks[i];
            if (tableOfAuthorsFromAllBooks[i] != null) {
                original = tableOfAuthorsFromAllBooks[i];
            }
            for (int j = i + 1; j < tableOfAuthorsFromAllBooks.length - 1; j++) {
                if (original != null && original.equals(tableOfAuthorsFromAllBooks[j])) {
                    tableOfAuthorsFromAllBooks[j] = null;
                }
            }
        }
        return trimTable(tableOfAuthorsFromAllBooks);
    }

    private Autor[] trimTable(Autor[] tableOfAuthorsFromAllBooks) {
        int counterOfNotNulss = 0;
        for (int i = 0; i < tableOfAuthorsFromAllBooks.length; i++) {
            if (tableOfAuthorsFromAllBooks[i] != null) {
                counterOfNotNulss++;
            }

        }
        Autor[] distictAuthos = new Autor[counterOfNotNulss];
        for (int i = 0; i < tableOfAuthorsFromAllBooks.length; i++) {
            if (tableOfAuthorsFromAllBooks[i] != null)
                distictAuthos[--counterOfNotNulss] = tableOfAuthorsFromAllBooks[i];
        }
        return distictAuthos;
    }

}

