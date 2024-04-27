package org.example.homework_19_04;
//Есть класс книга. У книги есть название,автор, год издания,
//количество страниц. Автор является отдельным классом
//У нескольких книг может быть один и тот же автор
//Создать 10 книг и поместить их в список
//
//
//Создать несколько вариантов сортировки:
//        1- По названию книги,
//        2- По имени автора,
//        3-По количеству страниц у книги
//4-По году издания
//
//
//С консоли запросить  ввод варианта сортировки в виде числа от 1 до 4
//В зависимости от того, какое число ввели отсортировать коллекцию
//нужным компаратором
public class Book {
    String title;
    Author author;
    int publishYear;
    int pages;


    public Book(String title, Author author, int publishYear, int pages) {
        this.title = title;
        this.author = author;
        this.publishYear = publishYear;
        this.pages = pages;
    }

    @Override
    public String toString() {
        return title + " by " + author.name + ", " + publishYear + ", " + pages + " pages";
    }
}