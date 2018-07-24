package com.paul.regression360v2;

import org.eclipse.jgit.api.TransportConfigCallback;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.paul.regression360v2.configuration.SshTransportConfigCallback;

@SpringBootApplication
public class Regression360v2Application {
	public static void main(String[] args) {
		SpringApplication.run(Regression360v2Application.class, args);
	}
}
