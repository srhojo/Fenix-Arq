package io.github.srhojo.fenix.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.retry.annotation.EnableRetry;

@EnableRetry
@RefreshScope
@EnableEurekaServer
@SpringBootApplication
public class EurekaApplication {

    public static void main(final String[] args) {
        SpringApplication.run(EurekaApplication.class, args);
    }

}
