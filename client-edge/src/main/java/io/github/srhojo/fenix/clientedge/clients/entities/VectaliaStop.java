package io.github.srhojo.fenix.clientedge.clients.entities;

import java.util.List;

public class VectaliaStop {

    private String id;
    private List<VectaliaLine> lines;

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(final String id) {
        this.id = id;
    }

    /**
     * @return the lines
     */
    public List<VectaliaLine> getLines() {
        return lines;
    }

    /**
     * @param lines the lines to set
     */
    public void setLines(final List<VectaliaLine> lines) {
        this.lines = lines;
    }
}
