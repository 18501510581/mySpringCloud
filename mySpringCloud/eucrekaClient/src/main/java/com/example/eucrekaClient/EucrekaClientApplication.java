package com.example.eucrekaClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication(exclude= DataSourceAutoConfiguration.class)
@EnableEurekaClient
public class EucrekaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(EucrekaClientApplication.class, args);
    }

}
