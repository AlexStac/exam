package ru.digitalleague.exam.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.digitalleague.exam.model.TeacherEntity;

@Repository
public interface TeacherRepository extends CrudRepository<TeacherEntity, Long> {
}
