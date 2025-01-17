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
        assertEquals("Executing shopping task", shopping.executeTask());
        assertEquals("shopping for weekend", shopping.getTaskName());
        assertEquals(false, shopping.isTaskExecuted());

    }

    @Test
    void testFactoryPaintingTasks() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task painting = taskFactory.processTask(TaskFactory.PAINTING);
        //Then
        assertEquals("Executing painting task", painting.executeTask());
        assertEquals("bedroom painting", painting.getTaskName());
        assertEquals(true, painting.isTaskExecuted());

    }

    @Test
    void testFactoryDrivingTasks() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task driving = taskFactory.processTask(TaskFactory.DRIVING);
        //Then
        assertEquals("Executing driving task", driving.executeTask());
        assertEquals("driving with parents", driving.getTaskName());
        assertEquals(false, driving.isTaskExecuted());

    }

}
