package com.nit.spring.beans;

import java.util.Locale;

import org.springframework.context.MessageSource;

public class I18NBean {
	
	private MessageSource messageSource;
	
	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}
	
	public MessageSource getMessageSource() {
		return messageSource;
	}
	
	public void displayMessge() {
		System.out.println(messageSource.getMessage("welcome msg", new Object[] {"Ripon"} , Locale.US));
		System.out.println(messageSource.getMessage("welcome msg", new Object[] {"Naresh"}, Locale.ITALY));
		System.out.println(messageSource.getMessage("welcome msg", null, Locale.ITALY));
	}
	
}
