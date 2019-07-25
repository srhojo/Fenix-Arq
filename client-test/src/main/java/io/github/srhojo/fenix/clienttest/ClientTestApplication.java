package io.github.srhojo.fenix.clienttest;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Import;

import com.srhojo.utils.restclient.RestClientConfiguration;

import io.github.srhojo.fenix.microservices.FenixMicroservice;

@FenixMicroservice
@Import({ RestClientConfiguration.class })
public class ClientTestApplication {

    public static void main(final String[] args) {
        SpringApplication.run(ClientTestApplication.class, args);
    }

}
