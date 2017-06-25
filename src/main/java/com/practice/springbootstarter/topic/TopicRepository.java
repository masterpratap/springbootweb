package com.practice.springbootstarter.topic;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

// CrudRepository takes object(modal) and its id data-type as generic values
@Repository
public interface TopicRepository extends CrudRepository<Topic, String> {

}
