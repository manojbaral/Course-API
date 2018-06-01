package com.manoj.springboot.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Manoj Baral on 12/25/2016.
 */

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

//    private List<Course> topics = new ArrayList<>(Arrays.asList(
//            new Course("spring", "Spring Framework", "Spring Framework Description"),
//            new Course("java", "Core Java", "Core Java Description"),
//            new Course("javaScript", "Javascript for developer", "JavaScript Description"),
//            new Course("node", "node for js", "Node js Description")
//
//    ));

    public List<Course> getAllCourses(String topicId) {
        List<Course> courses=new ArrayList<>();
        courseRepository.findByTopicId(topicId)
                .forEach(courses::add);
        return courses;
    }

    public Course getCourse(String id) {
        //return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
        return courseRepository.findOne(id);
    }

    public void addCourse(Course course) {
        courseRepository.save(course);
    }

    public void updateCourse( Course course) {
//        for (int i = 0; i < topics.size(); i++) {
//            Course t = topics.get(i);
//            if (t.getId().equals(id)) {
//                topics.set(i, topic);
//                return;
//            }
//        }
        courseRepository.save(course);
    }

    public void deleteCourse(String id) {
        //topics.removeIf(t -> t.getId().equals(id));
        courseRepository.delete(id);

    }

}
