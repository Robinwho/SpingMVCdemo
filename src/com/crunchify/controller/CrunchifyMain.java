package com.crunchify.controller;
 
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
/*
 * author: Crunchify.com
 * 
 */
 
public class CrunchifyMain {
 
	public static void main(String[] args) {
		CrunchifyLoadAllLoadedSpringMVCBean bean = new CrunchifyLoadAllLoadedSpringMVCBean();
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(new String[] { "crunchify-bean.xml" });
		bean.crunchifyLogSpringBeans(ctx);
	}
}