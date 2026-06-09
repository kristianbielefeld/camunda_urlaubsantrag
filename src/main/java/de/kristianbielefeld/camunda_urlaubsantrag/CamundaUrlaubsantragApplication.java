package de.kristianbielefeld.camunda_urlaubsantrag;

import io.camunda.client.annotation.Deployment;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Deployment(resources = "classpath:hello.bpmn")
public class CamundaUrlaubsantragApplication {

	public static void main(String[] args) {
		SpringApplication.run(CamundaUrlaubsantragApplication.class, args);
	}

}
