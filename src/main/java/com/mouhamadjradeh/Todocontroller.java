package com.mouhamadjradeh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value="app/v1")
public class Todocontroller {

    @Autowired
    private Todoservice todoservice;

      @GetMapping(value = {"/",""})
    public List<Todo> getALLtodos(){
           return todoservice.findAll();}

    @GetMapping("/{id}")
    public Todo getTodobyid(@PathVariable String id){
        return todoservice.getByid(id);}


    @PostMapping(value = {"/", ""})
    public  Todo CreateNewTodo(@RequestBody Todo todo){

          return todoservice.save(todo);
    }

    @DeleteMapping("/{id}")
    public void deleteTodo(@PathVariable String id){
        todoservice.delete(id);}
}
