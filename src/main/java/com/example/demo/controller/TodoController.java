package com.example.demo.controller;
import com.example.demo.model.*;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.TodoService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/todo-list")
@AllArgsConstructor
public class TodoController {
	private TodoService todoService;
	
	@GetMapping
	public List<todo> getAll(){
		return todoService.findAll();
	}
	
	@PostMapping("/save")
	public void createTodo(@RequestBody todo t) {
		todoService.save(t);
	}
	
	@PutMapping("/update")
	public void updateTodo(@RequestBody todo t) throws Exception {
		todo t1=todoService.findById(t.getTodoId());
		if(t1==null) {
			throw new Exception("Invalid id");
		}
		else {
			todoService.save(t);
		}
	}
	
	@DeleteMapping("/delete")
	public void deleteTodo(@RequestParam("todo-id") Integer id) {
		todoService.deleteById(id);
	}
	
	
	
}
