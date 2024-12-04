package com.kodilla.stream;

import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.mirrorstrings.Mirror;
import com.kodilla.stream.person.People;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {

        Mirror mirror = new Mirror();

        String result = mirror.mirrorText("ortsul");

        System.out.println(result);

        /*BookDirectory theBookDirectory = new BookDirectory();

        String theResultStringOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n", "<<", ">>"));

        System.out.println(theResultStringOfBooks);*/

//        Forum theForum = new Forum();
//
//        Map<Integer, ForumUser> theMapOfForumUsers = theForum.getUserList().stream()
//                .filter(forumUser -> forumUser.getSex() == 'M')
//                .filter(forumUser -> forumUser.getDateOfBirth().isBefore(LocalDate.of(2004, 11, 30)))
//                .filter(forumUser -> forumUser.getPostCount() > 0)
//                .collect(Collectors.toMap(ForumUser::getIdentifier, forumUser -> forumUser));
//
//        System.out.println("# elements: " + theMapOfForumUsers.size());
//        theMapOfForumUsers.entrySet().stream()
//                .map(entry -> entry.getKey() + ": " + entry.getValue())
//                .forEach(System.out::println);
    }
}