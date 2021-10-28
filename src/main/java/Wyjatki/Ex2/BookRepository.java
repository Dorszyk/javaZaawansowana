package Wyjatki.Ex2;

import java.util.ArrayList;
import java.util.List;

public class BookRepository {

    private List<Book> books = new ArrayList<>();

    public void  add(Book book){
        this.books.add(book);
    }

    public Book delete(String isbn) throws NoBookFoundException{
        for (Book book: books) {
            if (book.getIsbn().equals(isbn)){
                books.remove(book);
                return book;
            }

        }
        throw new NoBookFoundException("Can't delete book with isbn " + isbn);
    }

    public Book findByIsbn(String isbn) throws NoBookFoundException{
        for (Book book: books){
            if (book.getIsbn().equals(isbn)){
                return book;
            }
        }
        throw new NoBookFoundException("Can't find book with isbn" + isbn);
    }
    public List<Book>finByName(String name)throws NoBookFoundException {
        List<Book> booksByName = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().equals(name)) {
                booksByName.add(book);
            }
        }
        if (booksByName.isEmpty()) {
            throw new NoBookFoundException("Can't find book with name: " + name);
        }
        return booksByName;
    }

}


