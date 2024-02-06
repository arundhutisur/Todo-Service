package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.todo;

@Repository
public interface TodoRepository extends JpaRepository<todo, Integer>{

}
