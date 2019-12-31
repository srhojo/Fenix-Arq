package io.github.srhojo.fenix.clientedge.clients.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

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
