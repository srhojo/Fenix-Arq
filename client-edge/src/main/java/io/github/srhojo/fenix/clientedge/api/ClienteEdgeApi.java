package io.github.srhojo.fenix.clientedge.api;

import io.github.srhojo.fenix.clientedge.model.BusStop;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface ClienteEdgeApi {

    @GetMapping("/bus-stop/{id}")
    BusStop getStopInfo(@PathVariable String id);
}
