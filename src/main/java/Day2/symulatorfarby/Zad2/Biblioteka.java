package Day2.symulatorfarby.Zad2;

public class Biblioteka {

    private Egzemplarz[] egzemplarzs;

    public Biblioteka(Egzemplarz[] egzemplarzs) {
        this.egzemplarzs = egzemplarzs;
    }

    public Egzemplarz[] findByTitle(String title) {
        if (title != null) {
            int counterOfFoundBooks = 0;
            for (Egzemplarz egzemplarz : egzemplarzs) {
                if (egzemplarz.getTile().contains(title)) {
                    counterOfFoundBooks++;
                }
            }

            Egzemplarz[] foundBooks = new Egzemplarz[counterOfFoundBooks];
            for (int i = 0; i < egzemplarzs.length; i++) {
                if (title.contains(egzemplarzs[i].getTile())) {
                    foundBooks[--counterOfFoundBooks] = egzemplarzs[i];
                }
            }
            return foundBooks;
        }
        return null;

    }

    public Autor findByAutorsWithMostBook() {

        Autor[] tableOfAuthorsFromAllBooks = new Autor[egzemplarzs.length];
        for (int i = 0; i < egzemplarzs.length; i++) {
            tableOfAuthorsFromAllBooks[i] = egzemplarzs[i].getAutor();
        }
        tableOfAuthorsFromAllBooks = removeDuplicatesFromTableAndTrim(tableOfAuthorsFromAllBooks);

        int[] numberOfBooksFromAuthor = new int [tableOfAuthorsFromAllBooks.length];

        for (int i = 0; i < tableOfAuthorsFromAllBooks.length; i++) {
            numberOfBooksFromAuthor[i] = findByAuthor(tableOfAuthorsFromAllBooks[i]).length;

        }
        int indexOfMostProductwiveAuthor = findIndexOfMaxValue(numberOfBooksFromAuthor)

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

    private Autor[] trimTable(Autor[] tableOfAuthorsFromAllBooks) {
        int counterOfNotNulss = 0;
        for (int i = 0; i < tableOfAuthorsFromAllBooks.length; i++) {
            if  (tableOfAuthorsFromAllBooks[i] != null{
                counterOfNotNulss++;
            }

        }
        Autor[]distictAuthos = new Autor[counterOfNotNulss];
        for (int i = 0; i < tableOfAuthorsFromAllBooks.length; i++) {
            distictAuthos[--counterOfNotNulss] = tableOfAuthorsFromAllBooks[i];
        }
        return
    }

}

