package org.easytravelapi.common;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by miguel on 26/7/17.
 */
public class GetDataSheetRS extends AbstractRS {

    private List<Pair> values = new ArrayList<Pair>();


    public List<Pair> getValues() {
        return values;
    }

    public void setValues(List<Pair> values) {
        this.values = values;
    }
}
