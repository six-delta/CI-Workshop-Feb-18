package com.sixdelta.myrsoft.repository;

import org.springframework.data.repository.CrudRepository;


import com.sixdelta.myrsoft.models.Task;

public interface TaskRepository extends CrudRepository<Task,Integer>{

}
