package com.sixdelta.souhain.repositories;

import org.springframework.data.repository.CrudRepository;

import com.sixdelta.souhain.model.Task;

public interface TaskRepository extends CrudRepository<Task, Integer>{

}
