package org.easytravelapi.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

/**
 * Created by miguel on 26/7/17.
 */
public class Helper {

    public static String toJson(Object o) {
        ObjectMapper mapper = new ObjectMapper();
//Object to JSON in String
        String jsonInString = null;
        try {
            jsonInString = mapper.writeValueAsString(o);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return jsonInString;
    }


    public static <T> T fromString(Class<T> clas, String json) {
        ObjectMapper mapper = new ObjectMapper();

        T obj = null;
        try {
            obj = mapper.readValue(json, clas);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return obj;
    }

}
