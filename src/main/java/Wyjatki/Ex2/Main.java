package Wyjatki.Ex2;

import java.util.List;

public class Main {
    public static void main(String[] args) throws NoBookFoundException {

        BookRepository bookRepository = new BookRepository();

        bookRepository.add(new Book("Szach Mat", "J.K Rowling", "753159"));
        bookRepository.add(new Book("Harry Potter", "J.K Rowling", "852123"));
        bookRepository.add(new Book("Władca  Ogórków", "J.K Rowling", "987741"));

        bookRepository.add(new Book("Janko Pierdziszek", "Osiecka", "963214"));
        bookRepository.add(new Book("Waldek Kiepski", "Osiecka", "753357"));
        bookRepository.add(new Book("Kuku Na Muniu ", "Osiecka", "951159"));

        List<Book> books = bookRepository.finByName("Szach Mat");
        System.out.println(books);

        Book book1 = bookRepository.findByIsbn("753357");
        System.out.println(book1);

        Book book2 = bookRepository.delete("951159");
        System.out.println(book2);


    }

}
