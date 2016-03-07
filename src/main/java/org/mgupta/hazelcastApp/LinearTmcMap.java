package org.mgupta.hazelcastApp;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Mayank on 3/6/2016.
 */
public class LinearTmcMap {

    public static final long serialVersionUID = 1L;
    private String linearId;
    private List<String> tmcCodes;

    public LinearTmcMap(String linearId, List<String> tmcCodes) {
        this.linearId = linearId;
        this.tmcCodes = new LinkedList<>();
        this.tmcCodes.addAll(tmcCodes);
    }

    public List<String> getTmcCodes() {
        return tmcCodes;
    }

    public void setTmcCodes(List<String> tmcCodes) {
        this.tmcCodes = tmcCodes;
    }

    public String getLinearId() {
        return linearId;
    }

    public void setLinearId(String linearId) {
        this.linearId = linearId;
    }
}
