package de.kristianbielefeld.camunda_urlaubsantrag;

import io.camunda.client.CamundaClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SkeletonStarter implements CommandLineRunner {

    private static final Logger LOG = LoggerFactory.getLogger(SkeletonStarter.class);

    private final CamundaClient camundaClient;

    public SkeletonStarter(CamundaClient camundaClient) {
        this.camundaClient = camundaClient;
    }

    @Override
    public void run(String... args) {
        var event = camundaClient.newCreateInstanceCommand()
                .bpmnProcessId("hello-process")
                .latestVersion()
                .send()
                .join();
        LOG.info(">>> Prozessinstanz gestartet, key={}", event.getProcessInstanceKey());
    }
}