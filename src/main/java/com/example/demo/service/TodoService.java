package com.example.demo.service;

import java.util.List;

import com.example.demo.model.todo;

public interface TodoService {
	List<todo> findAll();
	
	todo findById(Integer id);
	
	void save(todo t);
	
	void deleteById(Integer id);
}
