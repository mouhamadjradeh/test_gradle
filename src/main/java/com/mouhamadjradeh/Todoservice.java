package com.mouhamadjradeh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class Todoservice {
    @Autowired
    private TodoRepository todoRepository;

    public List<Todo> findAll() {
        return todoRepository.findAll();
    }

    public Todo getByid(String id ){
  return todoRepository.findById(id).get();

    }
public Todo save (Todo todo){
        return todoRepository.save(todo);
}
    public void delete(String id )
    {
        todoRepository.deleteById(id);//kel hol wba3ed ma 3arafet todoRepository Just extend
    }

}
