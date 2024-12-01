package com.kodilla.stream.book;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookTestSuite {

    @Test
    void testGetListUsingFor() {
        //Given
        BookDirectory bookDirectory = new BookDirectory();

        //When
        List<Book> books = bookDirectory.getList();
        int numberOfBooksPublicatedAfter2007 = 0;
        for (Book book : books) {
            if (book.getYearOfPublication() > 2007) {
             numberOfBooksPublicatedAfter2007++;
            }
        }

        //Then
        assertEquals(3, numberOfBooksPublicatedAfter2007);
    }

    @Test
    void testGetListUsingIntStream() {
        //Given
        BookDirectory bookDirectory = new BookDirectory();

        //When
        List<Book> books = bookDirectory.getList();
        int numberOfBooksPublicatedAfter2007 = IntStream.range(0, books.size())
                .filter(index -> books.get(index).getYearOfPublication() > 2007)
                .map(index -> 1)
                .sum();

        //Then
        assertEquals(3, numberOfBooksPublicatedAfter2007);

    }

    @Test
    void testGetListUsingIntStreamAndCount() {
        //Given
        BookDirectory bookDirectory = new BookDirectory();
        
        //When
        List<Book> books = bookDirectory.getList();
        
        //Then
        long numberOfBooksPublicatedAfter2007 = IntStream.range(0, books.size())
                .filter(index -> books.get(index).getYearOfPublication() > 2007)
                .count();

        assertEquals(3, numberOfBooksPublicatedAfter2007);
    }
}
