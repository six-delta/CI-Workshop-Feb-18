package repositories;

import org.springframework.data.repository.CrudRepository;

import model.Task;

public interface TaskRespostory extends CrudRepository<Task, Integer> {

}
