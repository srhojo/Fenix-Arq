/**
 *
 */
package io.github.srhojo.fenix.clienttest.clients;

import io.github.srhojo.fenix.clienttest.clients.entities.VectaliaStop;
import io.github.srhojo.fenix.microservices.exceptions.FenixException;
import io.github.srhojo.utils.restclient.client.RestClient;
import io.github.srhojo.utils.restclient.entities.NameValuePair;
import io.github.srhojo.utils.restclient.exceptions.RestClientException;
import io.github.srhojo.utils.restclient.impl.RestClientBuilderExecutor;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientResponseException;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jrlh
 *
 */
@Component
public class VectaliaClientImpl implements VectaliaClient {

    private final String vectaliaApiUrl = "https://alicante.vectalia.es/ajax/microsite/isae-estimate-by-stop";

    private final RestClient restClient;

    public VectaliaClientImpl(final RestClient restClient) {
        this.restClient = restClient;
    }

    @Override
    public VectaliaStop getStopInfo(final String id) {
        final List<NameValuePair> queryParams = new ArrayList<>();
        queryParams.add(NameValuePair.of("lang", "es"));
        queryParams.add(NameValuePair.of("__internal__", "1"));
        queryParams.add(NameValuePair.of("code", id));

        try {
            return RestClientBuilderExecutor.of(restClient).url(vectaliaApiUrl).method(HttpMethod.GET)
                    .withQueryParams(queryParams).withResponseType(VectaliaStop.class).execute();

        } catch (RestClientException rce) {

            final RestClientResponseException response = (RestClientResponseException) rce.getDetails();
            throw new FenixException(rce.getStatus(),rce.getCode(),response.getMessage());
        }
    }

}
