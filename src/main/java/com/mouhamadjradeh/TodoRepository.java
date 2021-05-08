package com.mouhamadjradeh;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository //Todo type of id is string
public interface TodoRepository extends JpaRepository<Todo,String> {
}
