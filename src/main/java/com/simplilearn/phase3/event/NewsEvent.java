package com.simplilearn.phase3.event;

import org.springframework.context.ApplicationEvent;

public class NewsEvent extends ApplicationEvent {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NewsEvent(Object source) {
		super(source);
	}
	

}
