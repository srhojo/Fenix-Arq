package io.github.srhojo.fenix.clienttest.clients.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author jrlh
 *
 */
@JsonIgnoreProperties
public class VectaliaLine {

    private String line;
    private List<VectaliaLineStop> stops;

    public String getLine() {
        return line;
    }

    public void setLine(final String line) {
        this.line = line;
    }

    public List<VectaliaLineStop> getStops() {
        return stops;
    }

    public void setStops(final List<VectaliaLineStop> stops) {
        this.stops = stops;
    }

}
