/**
 *
 */
package io.github.srhojo.fenix.clienttest.clients;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;

import com.srhojo.utils.restclient.client.RestClient;
import com.srhojo.utils.restclient.entities.NameValuePair;
import com.srhojo.utils.restclient.impl.RestClientBuilderExecutor;

import io.github.srhojo.fenix.clienttest.clients.entities.VectaliaStop;

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

        return RestClientBuilderExecutor.of(restClient).url(vectaliaApiUrl).method(HttpMethod.GET)
                .withQueryParams(queryParams).withResponseType(VectaliaStop.class).execute();
    }

}
