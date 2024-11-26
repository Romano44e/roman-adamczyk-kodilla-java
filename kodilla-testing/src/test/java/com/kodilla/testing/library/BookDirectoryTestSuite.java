package com.kodilla.testing.library;

import com.kodilla.testing.weather.stub.Temperatures;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class BookDirectoryTestSuite {

    private List<Book> generateListOfBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<>();
        for (int n = 0; n < booksQuantity; n++) {
            Book theBook = new Book("Title" + n, "Author" + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }

    private static int testCounter = 0;

    @Mock
    private LibraryDatabase libraryDatabaseMock;

    @BeforeAll
    public static void init() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("This is the end of tests.");
    }

    @BeforeEach
    public void beforeEach() {
        testCounter++;
        System.out.println("Executing test number " + testCounter);
    }

    @Test
    void testListBooksWithConditionsReturnList() {
        //Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooks = new ArrayList<>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);                   // [5]
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);    // [6]
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);    // [7]
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        when(libraryDatabaseMock.listBooksWithCondition("Secret")).thenReturn(resultListOfBooks);

        //When
        List<Book> theListOfBooks = bookLibrary.listBookWithCondition("Secret");

        //Then
        assertEquals(4, theListOfBooks.size());
    }

    @Test
    void testListBooksWithConditionsMoreThan20() {
        //Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0Books = new ArrayList<>();
        List<Book> resultListOf15Books = generateListOfBooks(15);
        List<Book> resultListOf40Books = generateListOfBooks(40);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks"))
                .thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBooksWithCondition("FortyBooks"))
                .thenReturn(resultListOf40Books);
        //When
        List<Book> theListOf0Books = bookLibrary.listBookWithCondition("ZeroBooks");
        List<Book> theListOf15Books = bookLibrary.listBookWithCondition("Any title");
        List<Book> theListOf40Books = bookLibrary.listBookWithCondition("FortyBooks");
        //Then

        assertEquals(0, theListOf0Books.size());
        assertEquals(15, theListOf15Books.size());
        assertEquals(0, theListOf40Books.size());
    }

    @Test
    void testListBooksWithConditionFragmentShorterThan3() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);

        //When
        List<Book> theListofBooks10 = bookLibrary.listBookWithCondition("An");

        //Then
        assertEquals(0, theListofBooks10.size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
    }

    @Test
    void testListBooksInHandsOf0Books() {
        //Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> list = new ArrayList<>();
        LibraryUser libraryUser1 = new LibraryUser("Adam", "Kot", "1991");
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser1))
                .thenReturn(list);
        //When
        List<Book> emptyList = bookLibrary.listBooksInHandsOf(libraryUser1);
        //Then
        assertEquals(0, emptyList.size());
    }

    @Test
    void testListBooksInHandsOf1Book() {
        //Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> list = generateListOfBooks(1);
        LibraryUser libraryUser1 = new LibraryUser("Adam", "Kot", "1991");
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser1)).thenReturn(list);
        //When
        List<Book> listOf1Book = bookLibrary.listBooksInHandsOf(libraryUser1);
        //Then
        assertEquals(1, listOf1Book.size());
    }

    @Test
    void testListBooksInHandsOf5Books() {
        //Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> list = generateListOfBooks(5);
        LibraryUser libraryUser1 = new LibraryUser("Adam", "Kot", "1991");
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser1)).thenReturn(list);
        //When
        List<Book> listOf5Book = bookLibrary.listBooksInHandsOf(libraryUser1);
        //Then
        assertEquals(5, listOf5Book.size());
    }
}
