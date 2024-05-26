package org.example.homework_10_05;
// 1 уровень сложности: Создать класс Book с полями isbn, title, pages
//Создать хранилище книг BookStorage , внутри него хранить книги в HashMap.
//В этом хранилище(классе BookStorage) должны быть методы
//1)Получить все книги из хранилища,
//        2)Проверить наличие книги по isbn
//3)Добавить новую книгу в хранилище (сначала проверить что такой книги там нет)
//4)Получить книгу из хранилища по ее isbn.
//
//В коде основной программы, создать хранилище, создать 5 книг, добавить их в хранилище
//с помощью методов, упомянутых ранее.
//Получить список книг и вывести в консоль.
//Получить любую книгу и вывести в консоль.
//Добавить новую книгу и после вывести список книг в консоль.
public class Main {
    public static void main(String[] args) {
        // Создание хранилища книг
        BookStorage bookStorage = new BookStorage();

        // Создание 5 книг
        Book book1 = new Book("12345", "Java Basics", 300);
        Book book2 = new Book("23456", "Advanced Java", 500);
        Book book3 = new Book("34567", "Data Structures", 400);
        Book book4 = new Book("45678", "Algorithms", 350);
        Book book5 = new Book("56789", "Design Patterns", 450);

        // Добавление книг в хранилище
        bookStorage.addBook(book1);
        bookStorage.addBook(book2);
        bookStorage.addBook(book3);
        bookStorage.addBook(book4);
        bookStorage.addBook(book5);

        // Получить список всех книг и вывести в консоль
        System.out.println("All books in storage:");
        for (Book book : bookStorage.getAllBooks()) {
            System.out.println(book);
        }

        // Получить любую книгу и вывести в консоль
        System.out.println("\nBook with ISBN 34567:");
        System.out.println(bookStorage.getBook("34567"));

        // Добавить новую книгу и после вывести список книг в консоль
        Book newBook = new Book("67890", "Machine Learning", 600);
        boolean added = bookStorage.addBook(newBook);
        if (added) {
            System.out.println("\nNew book added successfully.");
        } else {
            System.out.println("\nBook with ISBN " + newBook.getIsbn() + " already exists.");
        }

        System.out.println("\nAll books in storage after adding new book:");
        for (Book book : bookStorage.getAllBooks()) {
            System.out.println(book);
        }
    }
}