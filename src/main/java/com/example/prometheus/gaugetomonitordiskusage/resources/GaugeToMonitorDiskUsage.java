package com.example.prometheus.gaugetomonitordiskusage.resources;

import io.prometheus.client.Gauge;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.file.FileStore;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Component
public class GaugeToMonitorDiskUsage {

    private static final Gauge gauge = Gauge.build()
            .name("logFile_available_space")
            .help("logs available spaces in bytes")
            .register();

    @Scheduled(fixedDelay = 10000, initialDelay = 30000)
    public void status(){
        logAvailableSpace();
        System.out.println("I am running..");
    }

    private void logAvailableSpace(){
        Path path = Paths.get("C:/Users/IjPersonalWorkspace/logs/application.log");
        FileStore file = null;
        try{
            file = Files.getFileStore(path);
            long availableBytes = file.getUsableSpace();
            gauge.set(availableBytes);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
