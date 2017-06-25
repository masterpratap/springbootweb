package com.practice.springbootstarter.course;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

// CrudRepository takes object(modal) and its id data-type as generic values
@Repository
public interface CourseRepository extends CrudRepository<Course, String> {

}
