package io.github.srhojo.fenix.clientedge.controllers;

import io.github.srhojo.fenix.clientedge.api.ClienteEdgeApi;
import io.github.srhojo.fenix.clientedge.clients.ClientTestClient;
import io.github.srhojo.fenix.clientedge.clients.entities.VectaliaStop;
import io.github.srhojo.fenix.clientedge.model.BusStop;
import io.github.srhojo.fenix.microservices.FenixController;

@FenixController
public class ClientEdgeController implements ClienteEdgeApi {

    private final ClientTestClient clientTestClient;

    public ClientEdgeController(ClientTestClient clientTestClient) {
        this.clientTestClient = clientTestClient;
    }

    @Override
    public BusStop getStopInfo(final String id) {


        final VectaliaStop vectaliaStop = clientTestClient.getStopInfo(id);

        BusStop busStop = new BusStop();
        busStop.setLine(vectaliaStop.getLines().get(0).getLine());

        return busStop;
    }
}
