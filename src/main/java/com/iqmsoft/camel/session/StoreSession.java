package com.iqmsoft.camel.session;

import javax.servlet.http.HttpSession;



import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.http.common.HttpMessage;

public class StoreSession implements Processor {

	public void process(Exchange exchange) throws Exception {
	    HttpSession session = exchange.getIn(HttpMessage.class).getRequest().getSession();
	    exchange.setProperty("session",session);
	}

	
}
