package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

public class LibraryTestSuite {

    @Test
    void testGetBooks() {
        //Given
        Library library = new Library("Astronomical library 1");
        IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> library.getBooks().add(new Book("Astronomy book " + n, "Author " + n, LocalDate.now())));

        //making a shallow clone of object astronomicalLibrary
        Library shallowClonedLibrary = null;
        try {
            shallowClonedLibrary = library.shallowCopy();
            shallowClonedLibrary.setName("Astronomical Library 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //making a deep clone of object astronomicalLibrary
        Library deepCloneLibrary = null;
        try {
            deepCloneLibrary = library.deepCopy();
            deepCloneLibrary.setName("Astronomical Library 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().add(new Book("Astronomy book 11", "Author 11", LocalDate.now()));

        //Then
        System.out.println(library);
        System.out.println(shallowClonedLibrary);
        System.out.println(deepCloneLibrary);
        assertEquals(11, library.getBooks().size());
        assertEquals(11, shallowClonedLibrary.getBooks().size());
        assertEquals(10, deepCloneLibrary.getBooks().size());
        assertEquals(shallowClonedLibrary.getBooks(), library.getBooks());
        assertNotEquals(deepCloneLibrary.getBooks(), library.getBooks());
    }

}
