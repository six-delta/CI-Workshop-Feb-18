package com.sixdelta.hollowbk201.repository;

import org.springframework.data.repository.CrudRepository;

import com.sixdelta.hollowbk201.model.Task;

public interface TaskRepository extends CrudRepository<Task, Integer>{
	

}
