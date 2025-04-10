package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class BoardTestSuite {

    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        board.toDoList.addTask("clean the kitchen");
        board.inProgressList.addTask("clean the bathroom");
        board.doneList.addTask("clean the bedroom");
        //Then
        System.out.println("to do list: " + board.toDoList.toString() + "\n"
        + "in progress list: " + board.inProgressList.toString() + "\n"
        + "done list: " + board.doneList.toString());
    }

}
