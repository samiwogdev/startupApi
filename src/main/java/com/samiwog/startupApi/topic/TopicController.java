package com.samiwog.startupApi.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@GetMapping("/topics")
	public List<Topic> getTopics() {

		return Arrays.asList(

				new Topic("1", "Java", "High Level programming Language"),
				new Topic("2", "History", "Showcase history"),
				new Topic("1", "Python", "AI programming Language"));

	}

}
