package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskFactoryTestSuite {

    @Test
    void testFactoryShoppingTasks() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task shopping = taskFactory.processTask(TaskFactory.SHOPPING);
        //Then
        assertTrue(shopping.isTaskExecuted());
        assertEquals("shopping for weekend", shopping.getTaskName());

    }

    @Test
    void testFactoryPaintingTasks() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task painting = taskFactory.processTask(TaskFactory.PAINTING);
        //Then
        assertTrue(painting.isTaskExecuted());
        assertEquals("bedroom painting", painting.getTaskName());

    }

    @Test
    void testFactoryDrivingTasks() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task driving = taskFactory.processTask(TaskFactory.DRIVING);
        //Then
        assertTrue(driving.isTaskExecuted());
        assertEquals("driving with parents", driving.getTaskName());

    }

}
