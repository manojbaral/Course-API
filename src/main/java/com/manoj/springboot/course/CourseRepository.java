package com.manoj.springboot.course;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Manoj Baral on 12/26/2016.
 */
public interface CourseRepository extends CrudRepository<Course,String> {

    public List<Course> findByTopicId(String topicId);
}
