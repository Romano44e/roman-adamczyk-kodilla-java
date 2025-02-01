package com.kodilla.hibernate.task.dao;

import com.kodilla.hibernate.task.Task;
import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Transactional
@Repository
public interface TaskDao extends CrudRepository<Task, Long> {

    List<Task> findByDuration(int duration);

    Optional<Task> findById(int id);

    void deleteById(int id);
}
