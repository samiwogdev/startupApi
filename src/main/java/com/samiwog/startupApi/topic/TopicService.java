package com.samiwog.startupApi.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topic> topics =  Arrays.asList(

			new Topic("1", "Java", "High Level programming Language"),
			new Topic("2", "History", "Showcase History"),
			new Topic("1", "Python", "AI Programming Language")
			);
	
	public List<Topic> getAllTopics(){
		return topics;
	}
}
