package com.simplilearn.phase3.event;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class NewsEventListeners {
	
	@EventListener
	public void dealer1(NewsEvent ne) {
		System.out.println("Dealer1 gets invoked!!");
	}
	
	@EventListener
	public void dealer2(NewsEvent ne) {
		System.out.println("Dealer2 gets invoked!!");
	}
	
	@EventListener
	public void dealer3(NewsEvent ne) {
		System.out.println("Dealer3 gets invoked!!");
	}

}
