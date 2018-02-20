package com.sixdelta.alvacovaco.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sixdelta.alvacovaco.model.Task;

@Repository("repositoryTask")
public interface TaskRepository extends CrudRepository<Task,Integer>{

}
