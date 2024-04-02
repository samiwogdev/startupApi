package com.samiwog.startupApi.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topic> topics = new ArrayList<>(
			Arrays.asList(

					new Topic("java", " Core Java", "Core Java Description"),
					new Topic("springboot", "Java Framework", "Java Framework Description"),
					new Topic("javascript", "Javascript", "Javascript Description"))
			);

	public List<Topic> getAllTopics() {
		return topics;
	}

	public Topic getTopic(String id) {
//		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();

		/** Alternative approach without using the Lambda expression **/
		for (Topic topic : topics) {
	        if (topic.getId().equals(id)) {
	            return topic;
	        }
	    }
	    throw new NoSuchElementException("Topic with id " + id + " not found");
	}
	
	public void addTopic(Topic topic) {
		topics.add(topic);
	}
	
	public void updateTopic(Topic topic, String id) {
		for(int i = 0; i < topics.size(); i ++) {
			Topic t = topics.get(i);
			if(t.getId().equals(id)) {
				topics.set(i, topic);
				return;
			}
			
		}
	}
}