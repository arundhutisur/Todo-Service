package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="todo-table")
public class todo {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer todoId;
	
	@Column(name="todoName")
	private TodoNameType todoName;
	
	@JsonProperty
	@Column(name="isCompleted")
	private boolean isCompleted;
	
	@Column(name="completionDate")
	private String completionDate;

	public todo(TodoNameType todoName, boolean isCompleted, String completionDate) {
		super();
		this.todoName = todoName;
		this.isCompleted = isCompleted;
		this.completionDate = completionDate;
	}	
}
