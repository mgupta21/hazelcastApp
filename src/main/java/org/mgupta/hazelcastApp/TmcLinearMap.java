package org.mgupta.hazelcastApp;

import java.io.Serializable;

/**
 * Created by Mayank on 3/6/2016.
 */
public class TmcLinearMap implements Serializable {
    public static final long serialVersionUID = 1L;
    private String tmcCode;
    private String linearId;

    public TmcLinearMap() {

    }

    public String getTmcCode() {
        return tmcCode;
    }

    public void setTmcCode(String tmcCode) {
        this.tmcCode = tmcCode;
    }

    public String getLinearId() {
        return linearId;
    }

    public void setLinearId(String linearId) {
        this.linearId = linearId;
    }
}
