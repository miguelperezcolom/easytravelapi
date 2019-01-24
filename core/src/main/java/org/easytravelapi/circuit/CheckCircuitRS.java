package org.easytravelapi.circuit;

import org.easytravelapi.common.AbstractRS;
import org.easytravelapi.common.Amount;

public class CheckCircuitRS extends AbstractRS {

    private boolean available;

    private Amount value;

    private String key;

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public Amount getValue() {
        return value;
    }

    public void setValue(Amount value) {
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
