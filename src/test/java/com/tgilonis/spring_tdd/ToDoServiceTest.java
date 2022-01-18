package com.tgilonis.spring_tdd;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ToDoServiceTest
{
    @Autowired
    private ToDoRepository toDoRepository;

    @AfterEach
    void tearDown() {
        toDoRepository.deleteAll();
    }

    @Test
    void getAllToDos() {
        ToDo todoSample = new ToDo("Todo Sample 1", true);
        toDoRepository.save(todoSample);
        ToDoService toDoService = new ToDoService(toDoRepository);

        ToDo firstToDo = toDoService.findAll().get(0);

        assertEquals(todoSample.getText(), firstToDo.getText());
        assertEquals(todoSample.isCompleted(), firstToDo.isCompleted());
        assertEquals(todoSample.getId(), firstToDo.getId());
    }

    @Test
    void saveAToDo() {
        ToDoService toDoService = new ToDoService(toDoRepository);
        ToDo todoSample = new ToDo("Todo Sample 1", true);

        toDoService.save(todoSample);

        assertEquals(1.0, toDoRepository.count());
    }
}