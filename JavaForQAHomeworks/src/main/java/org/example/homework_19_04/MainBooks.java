package org.example.homework_19_04;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MainBooks {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        Author author1 = new Author("Author A");
        Author author2 = new Author("Author B");

        books.add(new Book("Book 1", author1, 2001, 300));
        books.add(new Book("Book 2", author2, 2003, 500));
        books.add(new Book("Book 3", author1, 2010, 250));
        books.add(new Book("Book 4", author1, 2015, 30));
        books.add(new Book("Book 5", author2, 2008, 320));
        books.add(new Book("Book 6", author2, 2005, 150));
        books.add(new Book("Book 7", author1, 2020, 375));
        books.add(new Book("Book 8", author2, 2022, 555));
        books.add(new Book("Book 9", author1, 2009, 80));
        books.add(new Book("Book 10", author2, 2017, 333));

       books.sort(Comparator.comparing(book -> book.title));
        System.out.println(" Сортировка 1- По названию книги: ");
        for (Book book : books) {
            System.out.println(book);
        }

        books.sort(Comparator.comparing(book -> book.author.name));
        System.out.println(" Сортировка 2- По имени автора: ");
        for (Book book : books) {
            System.out.println(book);
        }

        books.sort(Comparator.comparing(book -> book.pages));
        System.out.println(" Сортировка 3- По количеству страниц у книги: ");
        for (Book book : books) {
            System.out.println(book);
        }

        books.sort(Comparator.comparing(book -> book.publishYear));
        System.out.println(" Сортировка 4- По году издания: ");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
