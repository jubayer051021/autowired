package com.jubayerBjit.learningspringframework;

import com.jubayerBjit.learningspringframework.Model.Config.BeanConfig;
import com.jubayerBjit.learningspringframework.Model.Implementation.Samsung;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class LearningSpringFrameworkApplication {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(BeanConfig.class);

		Samsung sp=context.getBean(Samsung.class);
		sp.config();
	}

}
