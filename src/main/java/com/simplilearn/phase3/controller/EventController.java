package com.simplilearn.phase3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.simplilearn.phase3.event.NewsEventPublisher;

@Controller
public class EventController {

	@Autowired
	NewsEventPublisher publisher;

	@GetMapping("/toi/pubish")
	public void publishEventObject() {
		publisher.publish();
	}
}

// @Component  @Controller, @Repository , @Service --> Stereotype annotation