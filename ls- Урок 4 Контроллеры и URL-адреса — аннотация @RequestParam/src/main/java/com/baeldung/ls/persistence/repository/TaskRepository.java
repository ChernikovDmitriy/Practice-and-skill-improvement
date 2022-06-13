package com.baeldung.ls.persistence.repository;

import com.baeldung.ls.persistence.model.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task, Long> {
}