package com.tgilonis.spring_tdd;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToDoService
{
    private ToDoRepository toDoRepository;

    public ToDoService(ToDoRepository toDoRepository)
    {
        this.toDoRepository = toDoRepository;
    }

    public List<ToDo> findAll() {
        return toDoRepository.findAll();
    }

    public ToDo save(ToDo toDo) {
        return toDoRepository.save(toDo);
    }
}
