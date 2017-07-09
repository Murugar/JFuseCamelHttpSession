package com.iqmsoft.camel.session;

import javax.servlet.http.HttpSession;


import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class SetStatus implements Processor {

	public void process(Exchange exchange) throws Exception {
	    exchange.getProperty("session",HttpSession.class).setAttribute("logged", true);
	}

}
