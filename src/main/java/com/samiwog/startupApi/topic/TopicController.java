package com.samiwog.startupApi.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@Autowired
	private TopicService topicservice;

	@GetMapping("/topics")
	public List<Topic> getTopics() {

		return topicservice.getAllTopics();
	}

}
