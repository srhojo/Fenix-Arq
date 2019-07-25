package io.github.srhojo.fenix.clienttest.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import io.github.srhojo.fenix.clienttest.clients.entities.VectaliaStop;

/**
 * @author jrlh
 *
 */

@FeignClient(name = "client-test")
public interface ClientTestApi {

    @GetMapping("/test/common-property")
    String commonPropertiesTest();

    @GetMapping("/test/title-property")
    String titlePropertyTest();

    @GetMapping("/test/bus-stop/{id}")
    VectaliaStop getStopInfo(@PathVariable String id);

}
