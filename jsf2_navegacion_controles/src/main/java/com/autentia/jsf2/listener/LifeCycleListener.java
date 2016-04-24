package com.autentia.jsf2.listener;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class LifeCycleListener implements PhaseListener {

	private static final long serialVersionUID = 7450120277377551L;
	
	private static final Log log = LogFactory.getLog(LifeCycleListener.class);

	public void afterPhase(PhaseEvent event) {
		if(log.isTraceEnabled()) {
			log.trace("AfterPhase: " + event.getPhaseId());
		}
	}

	public void beforePhase(PhaseEvent event) {
		if (log.isTraceEnabled()) {
			log.trace("BeforePhase: " + event.getPhaseId());
		}
		
	}

	public PhaseId getPhaseId() {
		return PhaseId.ANY_PHASE;
	}

}
