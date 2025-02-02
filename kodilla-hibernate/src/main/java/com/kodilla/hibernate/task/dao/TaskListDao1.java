package com.kodilla.hibernate.task.dao;

import com.kodilla.hibernate.task.TaskList1;
import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Transactional
@Repository
public interface TaskListDao1 extends CrudRepository<TaskList1, Long> {

    List<TaskList1> findByListName(String listName);

    void deleteById(int id);
}
