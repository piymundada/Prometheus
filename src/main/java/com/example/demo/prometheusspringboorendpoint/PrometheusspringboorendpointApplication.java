package com.example.demo.prometheusspringboorendpoint;

import io.prometheus.client.spring.boot.EnablePrometheusEndpoint;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnablePrometheusEndpoint
public class PrometheusspringboorendpointApplication {

    public static void main(String[] args) {
        SpringApplication.run(PrometheusspringboorendpointApplication.class, args);
    }

}
