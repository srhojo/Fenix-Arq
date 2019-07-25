/**
 *
 */
package io.github.srhojo.fenix.clienttest.clients;

import io.github.srhojo.fenix.clienttest.clients.entities.VectaliaStop;

/**
 * @author jrlh
 *
 */
public interface VectaliaClient {

    VectaliaStop getStopInfo(String id);

}
