package io.github.srhojo.fenix.clientedge.clients;

import io.github.srhojo.fenix.clientedge.clients.entities.VectaliaStop;
import io.github.srhojo.fenix.microservices.exceptions.feign.FeignExceptionHandler;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "client-test")
public interface ClientTestClient {


    @FeignExceptionHandler
    @GetMapping("/test/bus-stop/{id}")
    VectaliaStop getStopInfo(@PathVariable String id);
}
