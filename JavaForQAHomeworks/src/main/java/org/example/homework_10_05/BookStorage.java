package org.example.homework_10_05;

import java.util.HashMap;
import java.util.Collection;

public class BookStorage {
    private HashMap<String, Book> books;

    public BookStorage() {
        this.books = new HashMap<>();
    }

    // 1) Получить все книги из хранилища
    public Collection<Book> getAllBooks() {
        return books.values();
    }

    // 2) Проверить наличие книги по isbn
    public boolean containsBook(String isbn) {
        return books.containsKey(isbn);
    }

    // 3) Добавить новую книгу в хранилище (сначала проверить что такой книги там нет)
    public boolean addBook(Book book) {
        if (containsBook(book.getIsbn())) {
            return false;
        }
        books.put(book.getIsbn(), book);
        return true;
    }

    // 4) Получить книгу из хранилища по ее isbn
    public Book getBook(String isbn) {
        return books.get(isbn);
    }
}