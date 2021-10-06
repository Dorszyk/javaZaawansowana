package Day2.Zad2.Biblioteka;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Autor autor1 = new Autor("Jan", "Brzechwa");
        Autor autor2 = new Autor("Adam", "Mickiewicz");
        Egzemplarz egzemplarz1 = new Ksiazka(autor1,"Bajki dla dzieci");
        Egzemplarz egzemplarz2 = new Czasopismo(autor2, "Pan Tadeusz");
        Egzemplarz[] egzemplarzs = new Egzemplarz[]{egzemplarz1,egzemplarz2};
        Biblioteka biblioteka = new Biblioteka(egzemplarzs);

        System.out.println(Arrays.toString(biblioteka.findByTitle("Bajki dla dzieci")));
        //System.out.println(Arrays.toString(biblioteka.findByAuthor("Bajki dla dzieci")));
        //System.out.println(biblioteka.findByAutorsWithMostBook());

    }
}
