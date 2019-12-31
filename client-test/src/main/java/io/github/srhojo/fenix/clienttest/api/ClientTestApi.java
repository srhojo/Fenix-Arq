package io.github.srhojo.fenix.clienttest.api;

import io.github.srhojo.fenix.clienttest.clients.entities.VectaliaStop;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author jrlh
 */

//@FeignClient(name = "client-test")
public interface ClientTestApi {

    @GetMapping("/test/common-property")
    String commonPropertiesTest();

    @GetMapping("/test/title-property")
    String titlePropertyTest();

    @GetMapping("/test/bus-stop/{id}")
    VectaliaStop getStopInfo(@PathVariable String id);

}
