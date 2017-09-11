package org.easytravelapi.common;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by miguel on 26/7/17.
 */
public class Pair {

    private String key;
    private String value;

    private List<Pair> childValues = new ArrayList<Pair>();

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public List<Pair> getChildValues() {
        return childValues;
    }

    public void setChildValues(List<Pair> childValues) {
        this.childValues = childValues;
    }
}
