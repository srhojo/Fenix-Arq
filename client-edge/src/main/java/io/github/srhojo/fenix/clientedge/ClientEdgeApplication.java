package io.github.srhojo.fenix.clientedge;

import io.github.srhojo.fenix.microservices.FenixMicroservice;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@FenixMicroservice
//@EnableFeignClients(basePackages = "io.github.srhojo.fenix.clientedge.clients")
public class ClientEdgeApplication {

    public static void main(final String[] args) {
        SpringApplication.run(ClientEdgeApplication.class, args);
    }

}
