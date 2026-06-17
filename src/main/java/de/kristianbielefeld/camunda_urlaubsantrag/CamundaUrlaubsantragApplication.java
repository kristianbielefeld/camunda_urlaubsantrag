package de.kristianbielefeld.camunda_urlaubsantrag;

import io.camunda.client.annotation.Deployment;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Deployment(resources = {
		"classpath:urlaubsantrag.bpmn",
		"classpath:urlaubsantrag_start.form",
		"classpath:urlaubsantrag_genehmigen.form"
})
public class CamundaUrlaubsantragApplication {

	public static void main(String[] args) {
		SpringApplication.run(CamundaUrlaubsantragApplication.class, args);
	}

}
