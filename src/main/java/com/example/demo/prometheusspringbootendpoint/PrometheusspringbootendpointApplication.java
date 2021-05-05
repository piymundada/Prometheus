package com.example.demo.prometheusspringbootendpoint;

import io.prometheus.client.spring.boot.EnablePrometheusEndpoint;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnablePrometheusEndpoint
public class PrometheusspringbootendpointApplication {

    public static void main(String[] args) {
        SpringApplication.run(PrometheusspringbootendpointApplication.class, args);
    }

}
