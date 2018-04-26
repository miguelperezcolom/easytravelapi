package org.easytravelapi.common;

import io.swagger.annotations.ApiModel;

import java.util.HashMap;

@ApiModel(description = "Holder for translations")
public class MultilingualText extends HashMap<String, String> {

    public MultilingualText() {
        super();
    }

    public MultilingualText(String... args) {
        super();
        String k = null;
        for (String s : args) {
            if (k == null) k = s;
            else {
                put(k, s);
                k = null;
            }
        }
    }

}
