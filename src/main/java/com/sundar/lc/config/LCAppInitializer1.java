package com.sundar.lc.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class LCAppInitializer1 { //implements WebApplicationInitializer {
	
	//@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		System.out.println("Server automatically call this method.....");

		// inside the src/main/java folder.This is for Class
		AnnotationConfigWebApplicationContext applicationContext = new AnnotationConfigWebApplicationContext();
		applicationContext.register(LCApplicationConfig.class);

		// inside the src/main/resource folder.This is for XML
		/*
		 * XmlWebApplicationContext applicationContext = new XmlWebApplicationContext();
		 * applicationContext.setConfigLocation(
		 * "classpath:DispatcherServlet-servlet.xml");
		 */

		// create object for dispatcher servlet.
		DispatcherServlet dispatcherServlet = new DispatcherServlet(applicationContext);

		// register dispatcher servlet with servlet context.
		ServletRegistration.Dynamic customDispatcherServlet = servletContext.addServlet("myDispatcherServlet",
				dispatcherServlet);

		// load on startup
		customDispatcherServlet.setLoadOnStartup(1);

		// url mapping.
		customDispatcherServlet.addMapping("/");

	}

}
