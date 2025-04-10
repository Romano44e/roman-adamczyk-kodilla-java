//package com.kodilla.hibernate.tasklist.dao;
//
//import com.kodilla.hibernate.tasklist.TaskList;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//@SpringBootTest
//public class TaskListDaoTestSuite {
//
//    @Autowired
//    private TaskListDao taskListDao;
//
//    @Test
//    void testFindByListName() {
//        //Given
//        TaskList taskList = new TaskList("to do list", "the list contain tasks that have to be done");
//
//        //When
//        taskListDao.save(taskList);
//
//        //Then
//        String taskListName = taskList.getListName();
//        List<TaskList> listOfTaskLists = taskListDao.findByListName(taskListName);
//        assertNotNull(listOfTaskLists);
//        assertEquals("to do list", listOfTaskLists.get(0).getListName());
//
//        //CleanUp
//        int id = listOfTaskLists.get(0).getId();
//        taskListDao.deleteById(id);
//
//
//    }
//}
