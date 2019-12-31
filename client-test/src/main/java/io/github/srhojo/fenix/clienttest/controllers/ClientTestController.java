package io.github.srhojo.fenix.clienttest.controllers;

import org.springframework.beans.factory.annotation.Value;

import io.github.srhojo.fenix.clienttest.api.ClientTestApi;
import io.github.srhojo.fenix.clienttest.clients.VectaliaClient;
import io.github.srhojo.fenix.clienttest.clients.entities.VectaliaStop;
import io.github.srhojo.fenix.microservices.FenixController;

@FenixController
public class ClientTestController implements ClientTestApi {

    private final VectaliaClient vectaliaClient;

    //@Value("${com.fenix.test.texto}")
    //private String commonString;

    @Value("${com.fenix.client-test.title}")
    private String title;

    public ClientTestController(final VectaliaClient vectaliaClient) {
        this.vectaliaClient = vectaliaClient;
    }

    @Override
    public String commonPropertiesTest() {
        return "commonString";
    }

    @Override
    public String titlePropertyTest() {
        return title;
    }

    @Override
    public VectaliaStop getStopInfo(final String id) {
        return vectaliaClient.getStopInfo(id);
    }

}
