package com.tgilonis.spring_tdd;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("toDoRepository")
public interface ToDoRepository extends JpaRepository<ToDo, Long>
{

}
