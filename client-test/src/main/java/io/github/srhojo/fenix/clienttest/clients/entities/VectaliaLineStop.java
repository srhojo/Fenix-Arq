package io.github.srhojo.fenix.clienttest.clients.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author jrlh
 *
 */
@JsonIgnoreProperties
public class VectaliaLineStop {

    private String time;
    private String destinationName;

    public String getTime() {
        return time;
    }

    public void setTime(final String time) {
        this.time = time;
    }

    public String getDestinationName() {
        return destinationName;
    }

    public void setDestinationName(final String destinationName) {
        this.destinationName = destinationName;
    }

}
