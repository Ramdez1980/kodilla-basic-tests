package com.kodilla.collections.adv.immutable.special.homework;

import java.util.HashSet;
import java.util.Set;

public class BookManager {

    private static Set<Book> createdBooks = new HashSet<>();

    public static Book createBook(String title, String author) {
        Book book = new Book(title, author);
        if (createdBooks.contains(book)) {
            return createdBooks.stream()
                    .filter(b -> b.getAuthor().equals(author) && b.getTitle().equals(title))
                    .findFirst()
                    .get();
        } else {
            createdBooks.add(book);
            return book;
        }
    }

}
