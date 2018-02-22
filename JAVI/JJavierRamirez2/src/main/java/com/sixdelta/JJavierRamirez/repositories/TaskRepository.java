package com.sixdelta.JJavierRamirez.repositories;

import org.springframework.data.repository.CrudRepository;

import com.sixdelta.JJavierRamirez.model.Task;

public interface TaskRepository extends CrudRepository<Task, Integer> {

}
