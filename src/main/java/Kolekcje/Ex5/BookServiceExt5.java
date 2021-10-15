package Kolekcje.Ex5;

import Kolekcje.Ex2.Book;
import java.util.*;
import java.util.function.ToDoubleFunction;


public class BookServiceExt5 {

    private List<Book> books = new ArrayList<>();

    public void add(Book book) {
        books.add(book);
    }

    public void remove(Book book) {
        books.remove(book);
    }

    public List<Book> getAll() {
        return books;
    }


    public Stack<Book> createBooStack() {
        Collections.sort(books, Comparator.comparingDouble(new ToDoubleFunction<Book>() {

            @Override
            public double applyAsDouble(Book value) {
                return value.getPrice();
            }
        }));
        Stack<Book> bookStack = new Stack<>();
        for (Book book : books) {
            bookStack.push(book);
        }
        return bookStack;

        }
    }

