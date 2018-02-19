package com.sixdelta.albertojhs;

import org.springframework.data.repository.CrudRepository;

import com.sixdelta.albertojhs.Task;

public interface TaskRepository extends CrudRepository<Task, Integer> {

}