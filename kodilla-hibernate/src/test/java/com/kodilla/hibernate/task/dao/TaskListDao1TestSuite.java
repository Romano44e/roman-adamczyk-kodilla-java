//package com.kodilla.hibernate.task.dao;
//
//import com.kodilla.hibernate.task.Task;
//import com.kodilla.hibernate.task.TaskFinancialDetails;
//import com.kodilla.hibernate.task.TaskList1;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import java.math.BigDecimal;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//@SpringBootTest
//public class TaskListDao1TestSuite {
//
//
//    @Autowired
//    private TaskListDao1 taskListDao;
//    private static final String LISTNAME = "List number 1";
//
//    @Test
//    void testTaskListDaoSaveWithTasks() {
//        //Given
//        Task task = new Task("Test: Learn Hibernate", 14);
//        Task task2 = new Task("Test: Write some entities", 3);
//        TaskFinancialDetails tfd = new TaskFinancialDetails(new BigDecimal(20), false);
//        TaskFinancialDetails tfd2 = new TaskFinancialDetails(new BigDecimal(10), false);
//        task.setTaskFinancialDetails(tfd);
//        task2.setTaskFinancialDetails(tfd2);
//        TaskList1 taskList = new TaskList1(LISTNAME, "ToDo tasks");
//        taskList.getTasks().add(task);
//        taskList.getTasks().add(task2);
//        task.setTaskList(taskList);
//        task2.setTaskList(taskList);
//
//        //When
//        taskListDao.save(taskList);
//        int id = taskList.getId();
//
//        //Then
//        assertNotEquals(0, id);
//
//        //CleanUp
////        taskListDao.deleteById(id);
//    }
//}
