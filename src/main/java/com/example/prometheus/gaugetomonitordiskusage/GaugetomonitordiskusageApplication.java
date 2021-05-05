package com.example.prometheus.gaugetomonitordiskusage;

import io.prometheus.client.spring.boot.EnablePrometheusEndpoint;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnablePrometheusEndpoint
@EnableScheduling
public class GaugetomonitordiskusageApplication {

    public static void main(String[] args) {
        SpringApplication.run(GaugetomonitordiskusageApplication.class, args);
    }

}
