package com.sixdelta.neodevelop.repositories;

import org.springframework.data.repository.CrudRepository;

import com.sixdelta.neodevelop.model.Task;

public interface TaskRepository extends CrudRepository<Task, Integer> {

}
