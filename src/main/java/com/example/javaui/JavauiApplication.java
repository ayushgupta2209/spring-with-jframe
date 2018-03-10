package com.example.javaui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class JavauiApplication implements CommandLineRunner {

	@Autowired
	private ApplicationContext appContext;

	public static void main(String[] args) {
		new SpringApplicationBuilder(JavauiApplication.class).headless(false).run(args);
	}

	@Override
	public void run(String... args) throws Exception {
		java.awt.EventQueue.invokeLater(() -> appContext.getBean(InputNameForm.class).setVisible(true));
	}

}
