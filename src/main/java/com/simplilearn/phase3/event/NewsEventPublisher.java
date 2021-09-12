package com.simplilearn.phase3.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

@Component
public class NewsEventPublisher implements ApplicationEventPublisherAware{

	@Autowired
	private ApplicationEventPublisher publisher;

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		this.publisher = applicationEventPublisher;;
		
	}
	
	public void publish() {
		NewsEvent ne = new NewsEvent(this);
		publisher.publishEvent(ne);
	}
	
}
