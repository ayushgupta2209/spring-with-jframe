package com.example.javaui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class JavauiApplication implements CommandLineRunner {

	@Autowired
	private ApplicationContext appContext;

	@Autowired
	private static InputNameForm inputNameForm;

	public static void main(String[] args) {
		new SpringApplicationBuilder(JavauiApplication.class).headless(false).run(args);

		java.awt.EventQueue.invokeLater(() -> inputNameForm.setVisible(true));
	}

	@Override
	public void run(String... args) throws Exception {

		String[] beans = appContext.getBeanDefinitionNames();
		Arrays.sort(beans);
		for (String bean : beans) {
			System.out.println(bean);
		}

	}

	public void setInputNameForm(InputNameForm inputNameForm) {
		this.inputNameForm = inputNameForm;
	}
}
