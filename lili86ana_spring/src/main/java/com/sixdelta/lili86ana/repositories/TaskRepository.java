package com.sixdelta.lili86ana.repositories;

import org.springframework.data.repository.CrudRepository;

import com.sixdelta.lili86ana.model.Task;

public interface TaskRepository extends CrudRepository<Task, Integer> {

}