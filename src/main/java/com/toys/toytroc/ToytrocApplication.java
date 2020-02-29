package com.toys.toytroc;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class ToytrocApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		new SpringApplicationBuilder(ToytrocApplication.class)
				.web(WebApplicationType.SERVLET).run(args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ToytrocApplication.class)
				.web(WebApplicationType.SERVLET);
	}
}
