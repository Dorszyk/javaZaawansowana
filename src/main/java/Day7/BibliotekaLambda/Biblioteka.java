package Day7.BibliotekaLambda;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Biblioteka {

    private Egzemplarz[] egzemplarzs;

    public Biblioteka(Egzemplarz[] egzemplarzs) {
        this.egzemplarzs = egzemplarzs;
    }

    public List<Egzemplarz> findByTitle(String title) throws NoBookFoundException {
        if (title != null) {
            int counterOfFoundBooks = 0;
            for (Egzemplarz egzemplarz : egzemplarzs) {
                if (egzemplarz.getTile().contains(title)) {
                    counterOfFoundBooks++;
                }
            }

            Egzemplarz[] foundBooks = new Egzemplarz[counterOfFoundBooks];
            for (int i = 0; i < egzemplarzs.length; i++) {
                if ((egzemplarzs[i].getTile().contains(title))) {
                    foundBooks[--counterOfFoundBooks] = egzemplarzs[i];
                }
            }
            if(foundBooks.length == 0){
                throw new NoBookFoundException();
            }
            return Arrays.asList(foundBooks);
        }
        return null;
    }

    public Egzemplarz[] findByAuthor(Autor author) {


        return null;
    }

    public Optional<Autor> findByAutorsWithMostBook() {
        Autor[] tableOfAuthorsFromAllBooks = new Autor[egzemplarzs.length];
        for (int i = 0; i < egzemplarzs.length; i++) {
            tableOfAuthorsFromAllBooks[i] = egzemplarzs[i].getAutor();
        }
        tableOfAuthorsFromAllBooks = removeDuplicates(tableOfAuthorsFromAllBooks);

        int[] numberOfBooksFromAuthor = new int [tableOfAuthorsFromAllBooks.length];

        for (int i = 0; i < tableOfAuthorsFromAllBooks.length; i++) {
            numberOfBooksFromAuthor[i] = findByAuthor(tableOfAuthorsFromAllBooks[i]).length;
        }
        int indexOfMostProductiveAuthor = findIndexOfMaxValue(numberOfBooksFromAuthor);

        return Optional.ofNullable(tableOfAuthorsFromAllBooks[indexOfMostProductiveAuthor]);

    }

    private int findIndexOfMaxValue(int[] numberOfBooksFromAuthor) {
        int currentMax = 0;
        int indexOfMaxElement = 0;
        for (int i = 0; i < numberOfBooksFromAuthor.length; i++) {
            if (numberOfBooksFromAuthor [i] > currentMax){
                currentMax =numberOfBooksFromAuthor[i];
                indexOfMaxElement = i ;

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
            if  (tableOfAuthorsFromAllBooks[i] != null){
                counterOfNotNulss++;
            }

        }
        Autor[]distictAuthos = new Autor[counterOfNotNulss];
        for (int i = 0; i < tableOfAuthorsFromAllBooks.length; i++) {
            if (tableOfAuthorsFromAllBooks[i] != null)
            distictAuthos[--counterOfNotNulss] = tableOfAuthorsFromAllBooks[i];
        }
        return distictAuthos;
    }

}

