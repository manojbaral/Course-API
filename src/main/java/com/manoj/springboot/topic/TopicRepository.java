package com.manoj.springboot.topic;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by Manoj Baral on 12/26/2016.
 */
public interface TopicRepository extends CrudRepository<Topic,String> {
}
