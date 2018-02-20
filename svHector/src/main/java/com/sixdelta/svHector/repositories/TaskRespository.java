package com.sixdelta.svHector.repositories;

import org.springframework.data.repository.CrudRepository;

import com.sixdelta.svHector.model.Task;

public interface TaskRespository extends CrudRepository<Task, Integer> {

}
