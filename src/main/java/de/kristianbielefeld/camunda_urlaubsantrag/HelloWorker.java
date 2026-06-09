package de.kristianbielefeld.camunda_urlaubsantrag; // gleiches Package wie die Application-Klasse!

import io.camunda.client.annotation.JobWorker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class HelloWorker {

    private static final Logger LOG = LoggerFactory.getLogger(HelloWorker.class);

    @JobWorker(type = "say-hello")
    public void sayHello() {
        LOG.info(">>> Walking Skeleton: 'say-hello' Job empfangen und erledigt!");
    }
}