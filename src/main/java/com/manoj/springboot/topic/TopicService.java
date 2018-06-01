package com.manoj.springboot.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Manoj Baral on 12/25/2016.
 */

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

//    private List<Course> topics = new ArrayList<>(Arrays.asList(
//            new Course("spring", "Spring Framework", "Spring Framework Description"),
//            new Course("java", "Core Java", "Core Java Description"),
//            new Course("javaScript", "Javascript for developer", "JavaScript Description"),
//            new Course("node", "node for js", "Node js Description")
//
//    ));

    public List<Topic> getAllTopics() {
        List<Topic> topics=new ArrayList<>();
        topicRepository.findAll()
                .forEach(topics::add);
        return topics;
    }

    public Topic getTopic(String id) {
        //return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
        return topicRepository.findOne(id);
    }

    public void addTopic(Topic topic) {
        topicRepository.save(topic);
    }

    public void updateTopic(String id, Topic topic) {
//        for (int i = 0; i < topics.size(); i++) {
//            Course t = topics.get(i);
//            if (t.getId().equals(id)) {
//                topics.set(i, topic);
//                return;
//            }
//        }
        topicRepository.save(topic);
    }

    public void deleteTopic(String id) {
        //topics.removeIf(t -> t.getId().equals(id));
        topicRepository.delete(id);

    }

}
