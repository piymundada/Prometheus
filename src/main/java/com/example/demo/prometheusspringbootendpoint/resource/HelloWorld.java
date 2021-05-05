package com.example.demo.prometheusspringbootendpoint.resource;

import io.prometheus.client.Counter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    Logger logger = LoggerFactory.getLogger(HelloWorld.class);

    static final Counter counter = Counter.build()
            .name("total_request")
            .help("Total number of requests")
            .register();

    @GetMapping
    public String hello(){
        counter.inc();
        return "Hello World !";
    }

    @GetMapping("/log")
    public String Log(){
        logger.trace("A TRACE Message");
        logger.debug("A DEBUG Message");
        logger.info("An INFO Message");
        logger.warn("A WARN Message");
        logger.error("An ERROR Message");
        return "Check out the logs...";
    }

}
