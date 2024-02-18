package com.example.monitoring_microservice_with_grafana_and_prometheus;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MonitoringMicroserviceWithGrafanaAndPrometheusApplication {
    final static Logger logger = LoggerFactory.getLogger(MonitoringMicroserviceWithGrafanaAndPrometheusApplication.class);

    @GetMapping("message")
    public String getMessage(){
        logger.warn("Just checking");
        return "welcome salah-eddine";
    }

    public static void main(String[] args) {
        SpringApplication.run(MonitoringMicroserviceWithGrafanaAndPrometheusApplication.class, args);
    }

}
