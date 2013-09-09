package com.slowrusher.alg.svc;

import com.slowrusher.alg.svc.services.HelloService;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloApp {

	private static final Logger LOGGER = Logger.getLogger(HelloApp.class);

    public static void main(String[] args) {
		LOGGER.debug("Entering Main");
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        HelloService helloService = context.getBean(HelloService.class);
        System.out.println(helloService.sayHello());
		LOGGER.debug("Exiting Main");
    }
}
