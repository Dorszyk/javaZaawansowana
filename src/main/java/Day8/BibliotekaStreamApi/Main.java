package Day8.BibliotekaStreamApi;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Autor autor1 = new Autor("Jan", "Brzechwa");
        Autor autor2 = new Autor("Adam", "Mickiewicz");
        Egzemplarz egzemplarz1 = new Ksiazka(autor1, "Bajki dla dzieci");
        Egzemplarz egzemplarz2 = new Czasopismo(autor2, "Pan Tadeusz");
        Egzemplarz[] egzemplarzs = new Egzemplarz[]{egzemplarz1, egzemplarz2};
        Biblioteka biblioteka = new Biblioteka(egzemplarzs);

        //System.out.println(biblioteka.findByAuthor());
        //System.out.println(biblioteka.findByTitle());

        //System.out.println(Arrays.toString(biblioteka.findByTitle("Akademia kleksa")));
        //System.out.println("Nie znaleziono ksiazki o takim tytule");

        //System.out.println(Arrays.toString(biblioteka.findByAuthor("Bajki dla dzieci")));
        //System.out.println(biblioteka.findByAutorsWithMostBook());

    }
}
