package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {

    @Bean
    public Board getBoard() {
        return new Board(getToDoTaskList(), getInProgressTaskList(), getDoneTaskList());
    }

    @Bean
    public TaskList getToDoTaskList() {
        return new TaskList();
    }

    @Bean
    public TaskList getInProgressTaskList() {
        return new TaskList();
    }

    @Bean
    public TaskList getDoneTaskList() {
        return new TaskList();
    }
}
