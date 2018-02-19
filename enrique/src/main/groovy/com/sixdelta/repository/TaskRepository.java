package com.sixdelta.repository;
import org.springframework.data.repository.CrudRepository;

import com.sixdelta.model.Task;

public interface TaskRepository  extends CrudRepository<Task, Integer>{

}
