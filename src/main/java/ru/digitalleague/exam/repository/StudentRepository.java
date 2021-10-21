package ru.digitalleague.exam.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.digitalleague.exam.model.StudentEntity;

@Repository
public interface StudentRepository extends CrudRepository<StudentEntity, Long> {
}
