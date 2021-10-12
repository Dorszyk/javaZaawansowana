package Kolekcje.Ex2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("John", "Smith",'M');
        Author author2 = new Author("Jessica", "Albana",'F');
        Author author3 = new Author("Roger", "Moore",'M');
        Author author4 = new Author("Catherin", "Nadie",'F');

        Book book1 = new Book("Book 1", 34,2000, Arrays.asList(author1),Genre.FANTASY);
        Book book2 = new Book("Book 2", 56,1999, Arrays.asList(author2),Genre.ACTION);
        Book book3 = new Book("Book 3", 99,2018, Arrays.asList(author3),Genre.CRIME);
        Book book4 = new Book("Book 4", 199,2021, Arrays.asList(author4),Genre.FANTASY);

        BookService bookService = new BookService();
        bookService.add(book1);
        bookService.add(book2);
        bookService.add(book3);
        bookService.add(book4);

        System.out.println(bookService.findByAuthor(author2));
        System.out.println(bookService.getAll());
        System.out.println(bookService.findMostExpensiveBook());
        System.out.println(bookService.sortByTitleAsc());
        System.out.println(bookService.sortBytitleDsc());








    }
}
