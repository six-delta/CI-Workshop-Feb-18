package com.sixdelta.kozmoz.repositories;

import org.springframework.data.repository.CrudRepository;
import com.sixdelta.kozmoz.model.Task;

public interface TaskRepository extends CrudRepository<Task, Integer>   {

}
