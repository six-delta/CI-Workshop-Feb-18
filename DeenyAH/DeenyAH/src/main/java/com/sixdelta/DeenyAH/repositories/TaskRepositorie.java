package com.sixdelta.DeenyAH.repositories;

import org.springframework.data.repository.CrudRepository;

import com.sixdelta.DeenyAH.model.Task;

public interface TaskRepositorie extends CrudRepository	<Task, Integer> {

}
