package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {

    private final List<ForumUser> forumUserList = new ArrayList<>();

    public Forum() {
        forumUserList.add(new ForumUser(1, "Adam", 'M', LocalDate.of(1990, 5, 15), 2));
        forumUserList.add(new ForumUser(2, "Ania", 'F', LocalDate.of(2005, 10, 12), 4));
        forumUserList.add(new ForumUser(3, "Marek", 'M', LocalDate.of(2006, 4, 25), 10));
        forumUserList.add(new ForumUser(4, "Jola", 'F', LocalDate.of(1993, 12, 2), 5));
        forumUserList.add(new ForumUser(5, "Piotr", 'M', LocalDate.of(1999, 2, 14), 0));
        forumUserList.add(new ForumUser(6, "Ewelina", 'F', LocalDate.of(2008, 6, 30), 7));
        forumUserList.add(new ForumUser(6, "Krzysztof", 'M', LocalDate.of(2000, 3, 20), 6));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(forumUserList);
    }
}
