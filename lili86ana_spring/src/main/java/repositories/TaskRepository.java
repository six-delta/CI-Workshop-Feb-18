package repositories;

import org.springframework.data.repository.CrudRepository;
import model.Task;

public interface TaskRepository extends CrudRepository<Task, Integer> {

}