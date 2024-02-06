package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.todo;
import com.example.demo.repo.TodoRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class TodoServiceImpl implements TodoService {
	
	private TodoRepository todoRepository;

	@Override
	public List<todo> findAll() {
		// TODO Auto-generated method stub
		return todoRepository.findAll();
	}

	@Override
	public todo findById(Integer id) {
		// TODO Auto-generated method stub
		return todoRepository.findById(id).get();
	}

	@Override
	public void save(todo t) {
		// TODO Auto-generated method stub
		todoRepository.save(t);
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		todoRepository.deleteById(id);
	}

}
