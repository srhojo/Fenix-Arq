package io.github.srhojo.fenix.clienttest;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Import;

import io.github.srhojo.fenix.microservices.FenixMicroservice;
import io.github.srhojo.utils.restclient.RestClientConfiguration;

@FenixMicroservice
@Import({ RestClientConfiguration.class })
public class ClientTestApplication {

    public static void main(final String[] args) {
        SpringApplication.run(ClientTestApplication.class, args);
    }

}
