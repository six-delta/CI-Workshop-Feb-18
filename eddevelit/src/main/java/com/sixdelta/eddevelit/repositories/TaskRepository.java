package com.sixdelta.eddevelit.repositories;

import org.springframework.data.repository.CrudRepository;

import com.sixdelta.eddevelit.model.Task;

public interface TaskRepository extends CrudRepository<Task, Integer>{

}
